package com.example.tictactoemvc

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tictactoemvc.TicTacToeGame.Companion.COLUMNS
import com.example.tictactoemvc.TicTacToeGame.Companion.ROWS
import com.example.tictactoemvc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var model: TicTacToeGame
    private lateinit var field: Array<Array<Button>>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        model = TicTacToeGame(this)

        field = arrayOf(
            arrayOf(
                binding.button00,
                binding.button01,
                binding.button02
            ),
            arrayOf(
                binding.button10,
                binding.button11,
                binding.button12
            ),
            arrayOf(
                binding.button20,
                binding.button21,
                binding.button22
            )
        )

        updateState()

        for (row in 0 until ROWS) {
            for (column in 0 until COLUMNS) {
                field[row][column].setOnClickListener {
                    clickHandling(row, column)
                }
            }
        }

        binding.newGameButton.setOnClickListener {
            model.resetGame()
            clearField()
            updateState()
        }
    }

    private fun clickHandling(row: Int, column: Int) {
        with(binding) {
            gameStateView.text = model.stringForGameState()
            model.pressButtonAt(row, column)
            field[row][column].text = model.stringForButtonAt(row, column)
            updateState()
        }
    }

    private fun clearField() {
        for (row in 0 until ROWS) {
            for (column in 0 until COLUMNS) {
                field[row][column].text = ""
            }
        }
    }

    private fun updateState() {
        binding.gameStateView.text = model.stringForGameState()
    }
}