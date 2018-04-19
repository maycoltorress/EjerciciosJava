
package ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        promedio nota= new promedio();
        
        nota.ingresar((Float.parseFloat(JOptionPane.showInputDialog("Ingresa una nota"))),(Float.parseFloat(JOptionPane.showInputDialog("Ingresa una segunda nota"))),(Float.parseFloat(JOptionPane.showInputDialog("Ingresa una tercer nota"))),(Float.parseFloat(JOptionPane.showInputDialog("Ingresa una cuarta nota"))));
        JOptionPane.showMessageDialog(null,"el promedio es: "+nota.promedio());
        
    }
}
