
package ejercicio_8;

import javax.swing.JOptionPane;


public class descuento {
    
    private int producto;
    
    
    public void ingresar(int a){
        this.producto=a;
        
    }
    
    public void calcularDescuento(){
        if (this.producto>50000)
            JOptionPane.showMessageDialog(null,"Nuevo precio con descuento: "+(this.producto-(this.producto*0.1)));
        else
            JOptionPane.showMessageDialog(null,"No se aplica descuento");
        
                
    }
}
