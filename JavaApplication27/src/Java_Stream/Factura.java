
package Java_Stream;

public class Factura {
    
    private String dispositivo;
    private double precio;
    
    public Factura(String dispositivo,double precio){
        this.dispositivo = dispositivo;
        this.precio = precio;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
    
}
