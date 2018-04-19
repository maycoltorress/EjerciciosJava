
package ejercicio_5;

import javax.swing.JOptionPane;


public class Ejercicio_5 {

  
    public static void main(String[] args) {
        iva producto=new iva();
        producto.ingresar(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor neto del producto")));
        JOptionPane.showMessageDialog(null,"el valor IVA del producto es: "+producto.valorIva()+"\n y el valor del producto con IVA incluido es: "+producto.productoConIva());
        
    }
}
