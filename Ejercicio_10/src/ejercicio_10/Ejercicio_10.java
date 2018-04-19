
package ejercicio_10;

import javax.swing.JOptionPane;


public class Ejercicio_10 {

    public static void main(String[] args) {
        agencia conductor=new agencia();
        
        conductor.ingresar((Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sexo\n 1- Hombre\n 2-Mujer"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"))));
        conductor.calcularPago();
    }
}
