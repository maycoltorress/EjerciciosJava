
package ejercicio_10;

import javax.swing.JOptionPane;

public class agencia {
    private int sexo;
    private int edad;
    
    
    public void ingresar(int a, int b){
        this.sexo=a;
        this.edad=b;
    }
    
    public void calcularPago(){
        if (this.sexo==1 || this.sexo==2){
           
            if (this.sexo==1 && this.edad<25)
                JOptionPane.showMessageDialog(null,"Sexo: Hombre\n Edad: "+this.edad+"\n Debera pagar $30.000 pesos");
            if (this.sexo==1 && this.edad>=25)
                JOptionPane.showMessageDialog(null,"Sexo: Hombre\n Edad: "+this.edad+"\n Debera pagar $25.000 pesos");
            
            if (this.sexo==2 && this.edad<21)
                JOptionPane.showMessageDialog(null,"Sexo: Mujer\n Edad: "+this.edad+"\n Debera pagar $28.000 pesos");
            if (this.sexo==2 && this.edad>=21)
                JOptionPane.showMessageDialog(null,"Sexo: Mujer\n Edad: "+this.edad+"\n Debera pagar $20.000 pesos");
        }
        else
             JOptionPane.showMessageDialog(null,"Por favor ingrese 1 o 2 en las opciones");
    }
    
}
