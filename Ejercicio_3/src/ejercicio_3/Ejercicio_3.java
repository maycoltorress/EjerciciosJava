
package ejercicio_3;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

    public static void main(String[] args) {
       
        perimetro triangulo=new perimetro();
        triangulo.ingresar((Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la medida de los 3 lados del triangulo\n Ingrese primer lado"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo lado"))),(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tercer lado"))));
        JOptionPane.showMessageDialog(null,"el perimetro del triangulo es: "+triangulo.perimetro());
    }
}
