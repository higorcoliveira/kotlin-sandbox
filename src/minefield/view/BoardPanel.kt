package minefield.view

import minefield.model.Board
import java.awt.GridLayout
import javax.swing.JPanel

class BoardPanel(board: Board): JPanel() {

    init {
        layout = GridLayout(board.qtRows, board.qtColumns)
        board.forEachField { field ->
            val button = ButtonField(field)
            add(button)
        }
    }
}