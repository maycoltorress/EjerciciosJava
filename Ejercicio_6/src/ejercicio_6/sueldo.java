
package ejercicio_6;


public class sueldo {
    private int horasNor;
    private int horasExt;
    
    public void ingresar(int a , int b){
        this.horasNor=a;
        this.horasExt=b;
        
    }
    
    public int calcularSueldo(){
        return ((this.horasNor*5000)+(this.horasExt*7500));
        
    }
    
}
