
package ejercicio_7;


public class conversor {
    private int pesosCh;
    private float valorDolar;
    
    
    public void ingresar(int a, float b){
        this.pesosCh=a;
        this.valorDolar=b;
    }
    
    public float convertir(){
        return this.pesosCh/this.valorDolar;
    }
}
