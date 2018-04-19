
package ejercicio_4;
import static java.lang.Math.PI;

public class area {
    private int radio;
    
    
    public void ingresar(int a){
        this.radio=a;
    }
    
    public double area(){
        return PI*this.radio*this.radio;
    }
  
}
