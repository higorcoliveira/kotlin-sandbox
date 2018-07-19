package minefield.view

import minefield.model.Field
import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class MouseClickListener(
    private val field: Field,
    private val onLeftButton: (Field) -> Unit,
    private val onRightButton: (Field) -> Unit
): MouseListener {

    override fun mouseReleased(e: MouseEvent?) { }

    override fun mouseEntered(e: MouseEvent?) { }

    override fun mouseClicked(e: MouseEvent?) { }

    override fun mouseExited(e: MouseEvent?) { }

    override fun mousePressed(e: MouseEvent?) {
        when(e?.button) {
            MouseEvent.BUTTON1 -> onLeftButton(field)
            MouseEvent.BUTTON3 -> onRightButton(field) // depende do SO, pode ser o 2 tambem
        }
    }
}