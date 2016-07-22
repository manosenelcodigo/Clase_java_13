
package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Eventos implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("se ha hecho clic");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("se ha presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("se ha levantado el mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("haz entrado");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("haz salido");
    }
    
}
