
package ejercicio_5;


public class iva {
    private int valor;

    public void ingresar(int a){
        this.valor=a;
    }
    
    public double valorIva(){
        return this.valor*0.19;
    }
    public double productoConIva(){
        return this.valor*1.19;
    }
}
