
package ejercicio_8;

import javax.swing.JOptionPane;


public class Ejercicio_8 {

    public static void main(String[] args) {
        
        descuento producto=new descuento();
        producto.ingresar(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del producto")));
        producto.calcularDescuento();
   
    }
}
