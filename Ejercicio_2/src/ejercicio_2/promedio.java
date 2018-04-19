
package ejercicio_2;

public class promedio {
    private float n1;
    private float n2;
    private float n3;
    private float n4;
    
    
    public void ingresar(float a, float b, float c, float d){
        this.n1=a;
        this.n2=b;
        this.n3=c;
        this.n4=d;
    }
    
    public float promedio(){
        return (this.n1+this.n2+this.n3+this.n4)/4;
    }
}
