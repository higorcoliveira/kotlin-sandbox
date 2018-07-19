package minefield.view

import minefield.model.Board
import minefield.model.BoardEvent
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main(args: Array<String>) {
    MainScreen()
}

class MainScreen: JFrame() {

    private val board = Board(qtRows = 16, qtColumns = 30, qtMines = 89)
    private val boardPanel = BoardPanel(board)

    init {
        board.onEvent(this::showResult)
        add(boardPanel)

        setSize(690, 438) // tamanho do jogo
        setLocationRelativeTo(null) // centralizado
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "Campo Minado"
        isVisible = true
    }

    private fun showResult(boardEvent: BoardEvent) {
        SwingUtilities.invokeLater {
            val msg = when(boardEvent) {
                BoardEvent.VICTORY -> "GANHOU!"
                BoardEvent.LOSE -> "PERDEU!"
            }

            JOptionPane.showMessageDialog(this, msg)
            board.reset()

            boardPanel.repaint()
            boardPanel.validate()
        }
    }
}