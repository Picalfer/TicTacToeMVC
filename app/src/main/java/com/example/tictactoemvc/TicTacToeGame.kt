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
        //TODO
    }
}