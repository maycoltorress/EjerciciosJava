
package ejercicio_3;


public class perimetro {
    private int lado1;
    private int lado2;
    private int lado3;
    
    public void ingresar(int a,int b,int c){
        this.lado1=a;
        this.lado2=b;
        this.lado3=c;
    }
    
    public int perimetro(){
        return this.lado1+this.lado2+this.lado3;
    }
}
