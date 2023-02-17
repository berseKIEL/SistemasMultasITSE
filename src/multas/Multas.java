package multas;

import interfaz.InterfazInfractor;
import static java.awt.image.ImageObserver.PROPERTIES;
import javax.swing.JFrame;

public class Multas {

    public static void main(String[] args) {
        InterfazInfractor interfaz= new InterfazInfractor();
        interfaz.setTitle("Infractor");
        interfaz.setVisible(true);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
