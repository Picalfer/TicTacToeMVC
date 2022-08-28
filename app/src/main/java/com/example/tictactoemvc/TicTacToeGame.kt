package com.example.tictactoemvc

class TicTacToeGame {

    private var board: Array<Array<Mark>> = Array(ROWS) { Array(COLUMNS) { Mark.MARK_NONE } }
    var gameState: GameState = GameState.X_TURN

    companion object {
        val ROWS = 3
        val COLUMNS = 3
    }

    enum class Mark {
        MARK_NONE,
        MARK_X,
        MARK_0
    }

    enum class GameState {
        X_TURN,
        O_TURN,
        X_WINS,
        O_WINS,
        TIE_GAME
    }

    init {
        resetGame()
    }

    fun resetGame() {
        board = Array(ROWS) { Array(COLUMNS) { Mark.MARK_NONE } }
        gameState = GameState.X_TURN
    }

    fun stringForButtonAt(row: Int, column: Int): String {
        if (row in 0 until ROWS && column in 0 until COLUMNS) {
            if (board[row][column] == Mark.MARK_X) {
                return "X"
            }
            if (board[row][column] == Mark.MARK_0) {
                return "O"
            }
        }
        return ""
    }

    fun pressButtonAt(row: Int, column: Int) {
        if (row !in 0 until ROWS || column !in 0 until COLUMNS) {
            return
        }

        if (board[row][column] != Mark.MARK_NONE) {
            return
        }

        if (gameState == GameState.X_TURN) {
            board[row][column] = Mark.MARK_X
            gameState = GameState.O_TURN
            checkForWin()
        } else if (gameState == GameState.O_TURN) {
            board[row][column] = Mark.MARK_0
            gameState = GameState.X_TURN
            checkForWin()
        }
    }

    private fun checkForWin() {
        if (gameState != GameState.X_TURN && gameState != GameState.O_TURN) {
            return
        }
        if (didPieceWin(Mark.MARK_X)) {
            gameState = GameState.X_WINS
        } else if (didPieceWin(Mark.MARK_0)) {
            gameState = GameState.O_WINS
        } else if (isBoardFull()) {
            gameState = GameState.TIE_GAME
        }
    }

    private fun didPieceWin(mark: Mark): Boolean {

        // check for each rows
        for (row in 0 until ROWS) {
            var winHere = true
            for (column in 0 until COLUMNS) {
                if (board[row][column] != mark) {
                    winHere = false
                }
            }
            if (winHere) {
                return true
            }
        }

        // check for columns
        for (column in 0 until COLUMNS) {
            var winHere = true
            for (row in 0 until ROWS) {
                if (board[row][column] != mark) {
                    winHere = false
                }
            }
            if (winHere) {
                return true
            }
        }

        // check for main diagonal
        var winHere = true
        for (row in 0 until ROWS) {
            if (board[row][row] != mark) {
                winHere = false
            }
        }
        if (winHere) {
            return true
        }

        // check for off diagonal
        winHere = true
        for (row in 0 until ROWS) {
            if (board[row][ROWS - row - 1] != mark) {
                winHere = false
            }
        }
        if (winHere) {
            return true
        }
        return false
    }

    private fun isBoardFull(): Boolean {
        for (row in 0 until ROWS) {
            for (column in 0 until COLUMNS) {
                if (board[row][column] == Mark.MARK_NONE) {
                    return false
                }
            }
        }
        return true
    }
}