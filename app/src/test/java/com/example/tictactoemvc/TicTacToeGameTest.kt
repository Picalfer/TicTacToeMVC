package com.example.tictactoemvc

import android.content.Context
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * unit test for TicTacToe, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class TicTacToeGameTest {
    /*
    @Test
    fun boardIsReset() {
        val game = TicTacToeGame()

        for (row in 0 until TicTacToeGame.ROWS) {
            for (column in 0 until TicTacToeGame.COLUMNS) {
                assertEquals("", game.stringForButtonAt(row, column))
            }
        }

        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
    }

    @Test
    fun pressRegisters() {
        val game = TicTacToeGame()

        game.pressButtonAt(1, 2)
        assertEquals("X", game.stringForButtonAt(1, 2))
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)

        game.pressButtonAt(2, 2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        assertEquals("O", game.stringForButtonAt(2, 2))

        game.pressButtonAt(2, 2)
        assertEquals("O", game.stringForButtonAt(2, 2))
    }

    @Test
    fun pressOutOfBoundsIsIgnored() {
        val game = TicTacToeGame()

        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(-1, 0)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0, -1)
        game.pressButtonAt(3, 0)
        game.pressButtonAt(0, 3)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
    }

    @Test
    fun detectWinEasy() {
        val game = TicTacToeGame()
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,0)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(2,0)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,1)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(2,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,2)
        assertEquals(TicTacToeGame.GameState.X_WINS, game.gameState)
    }

    @Test
    fun detectWinForce() {
        val game = TicTacToeGame()
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(1,1)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(0,1)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,0)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(2,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(2,0)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(0,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(1,0)
        assertEquals(TicTacToeGame.GameState.X_WINS, game.gameState)
    }

    @Test
    fun detectTie() {
        val game = TicTacToeGame()
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(1,1)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(0,1)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,0)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(2,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(2,0)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(0,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(1,2)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(1,0)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(2,1)
        assertEquals(TicTacToeGame.GameState.TIE_GAME, game.gameState)
    }

    @Test
    fun detectXWinsBottomLeftToUpperRightDiagonal() {
        val game = TicTacToeGame()
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(0,2)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(0,1)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(1,1)
        assertEquals(TicTacToeGame.GameState.O_TURN, game.gameState)
        game.pressButtonAt(2,2)
        assertEquals(TicTacToeGame.GameState.X_TURN, game.gameState)
        game.pressButtonAt(2,0)
        assertEquals(TicTacToeGame.GameState.X_WINS, game.gameState)
    }*/
}