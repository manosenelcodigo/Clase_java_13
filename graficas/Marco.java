
package graficas;

import eventos.Eventos;
import eventos.Eventos2;
import javax.swing.JFrame;


public class Marco extends JFrame 
{
    public void getVentana()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setTitle("#manosenelcódigo");
        addMouseListener(new Eventos2());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
