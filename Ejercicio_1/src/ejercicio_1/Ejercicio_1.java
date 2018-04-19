
package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio_1 {

    public static void main(String[] args) {
       
        numero num = new numero();
        num.ingresar((Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un segundo numero"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingresa un tercer numero"))));
        
        JOptionPane.showMessageDialog(null,"La multiplicacion de esos 3 numeros es:  "+num.multiplicar());
       
    }
}
