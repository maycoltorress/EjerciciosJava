
package ejercicio_4;

import javax.swing.JOptionPane;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        area circulo= new area();
        circulo.ingresar(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio del circulo")));
        JOptionPane.showMessageDialog(null,"el area del circulo es: "+circulo.area());
       
    }
}
