
package ejercicio_9;

import javax.swing.JOptionPane;


public class descuento {
    
    private int monto;
    
    
    public void ingresar(int a){
        this.monto=a;
        
    }
    
    public void calcularDescuento(){
        if (this.monto<500)
            JOptionPane.showMessageDialog(null,"No se aplica descuento");
        
        if (this.monto>=500 && this.monto<=1000)
            JOptionPane.showMessageDialog(null,"Descuento 5%: "+(this.monto-(this.monto*0.05)));
        
        if (this.monto>1000 && this.monto<=7000)
            JOptionPane.showMessageDialog(null,"Descuento 11%: "+(this.monto-(this.monto*0.11)));
        
        if (this.monto>7000 && this.monto<=15000)
            JOptionPane.showMessageDialog(null,"Descuento 18%: "+(this.monto-(this.monto*0.18)));
        
        if (this.monto>15000)
            JOptionPane.showMessageDialog(null,"Descuento 25%: "+(this.monto-(this.monto*0.25)));
            
            
    }
}
