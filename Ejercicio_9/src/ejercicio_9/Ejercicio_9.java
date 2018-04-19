
package ejercicio_9;

import javax.swing.JOptionPane;


public class Ejercicio_9 {


    public static void main(String[] args) {
       descuento producto=new descuento();
        producto.ingresar(Integer.parseInt(JOptionPane.showInputDialog("Ingresar monto de la compra")));
        producto.calcularDescuento();
    }
}
