
package ejercicio_7;

import javax.swing.JOptionPane;

public class Ejercicio_7 {

    public static void main(String[] args) {
        conversor dinero=new conversor();
        dinero.ingresar((Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de pesos Chilenos"))),(Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del dolar actual"))));
        JOptionPane.showMessageDialog(null,"Serian: "+dinero.convertir()+" dolares");
    }
}
