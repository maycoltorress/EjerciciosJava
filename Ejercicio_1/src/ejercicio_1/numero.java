
package ejercicio_1;


public class numero {
    private int numero1;
    private int numero2;
    private int numero3;
    
    public void ingresar(int a, int b, int c){
     this.numero1=a;
     this.numero2=b;
     this.numero3=c;
 }
    
    public int multiplicar(){
        return this.numero1*this.numero2*this.numero3;
        
    }
    
}
