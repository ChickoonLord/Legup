package puzzle.masyu;

import controller.ElementController;
import model.gameboard.Element;

import java.awt.event.MouseEvent;

public class MasyuController extends ElementController
{
    @Override
    public void changeCell(MouseEvent e, Element data)
    {
        MasyuCell cell = (MasyuCell)data;
        if(e.getButton() == MouseEvent.BUTTON1)
        {
            if(e.isControlDown())
            {
                this.boardView.getSelectionPopupMenu().show(boardView, this.boardView.getCanvas().getX() + e.getX(), this.boardView.getCanvas().getY() + e.getY());
            }
            else
            {
                if(cell.getData() == -2)
                {
                    data.setData(-4);
                }
                else if(cell.getData() == -4)
                {
                    data.setData(-3);
                }
                else
                {
                    data.setData(-2);
                }
            }
        }
        else if(e.getButton() == MouseEvent.BUTTON3)
        {
            if(cell.getData() == -4)
            {
                data.setData(-2);
            }
            else if(cell.getData() == -2)
            {
                data.setData(-3);
            }
            else
            {
                data.setData(-4);
            }
        }
    }
}