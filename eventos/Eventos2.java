
package eventos;

import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;


public class Eventos2 extends MouseAdapter 
{
    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("Coordenadas : x="+e.getX()+" y="+e.getY());
        //System.out.println(e.getClickCount());
        System.out.println(e.getModifiersEx());
       if(e.getModifiersEx()==InputEvent.BUTTON3_DOWN_MASK)
       {
           JOptionPane.showMessageDialog(null, "se ha hecho clic derecho");
       }
    }
}
