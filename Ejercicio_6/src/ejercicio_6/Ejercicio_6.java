
package ejercicio_6;

import javax.swing.JOptionPane;


public class Ejercicio_6 {
 
    public static void main(String[] args) {
        sueldo persona= new sueldo();
        persona.ingresar((Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas Normales trabajadas"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horas Extras trabajadas"))));
        JOptionPane.showMessageDialog(null,"El sueldo final es: "+persona.calcularSueldo());
        
    }
}
