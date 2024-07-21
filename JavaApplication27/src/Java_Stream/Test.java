
package Java_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Ignacio
 */
public class Test {


    public static void main(String[] args) {
      
        Factura f = new Factura("ordenador", 1000);
        Factura f2 = new Factura("movil", 300);
        Factura f3 = new Factura("impresora", 200);
        Factura f4 = new Factura("imac", 1500);
        
        List<Factura> lista = new ArrayList<>();
        
        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        //El método filter() nos permite seleccionar un flujo de elementos que satisfacen un predicado.
        
        /**
         * Usamos la operación de filter para quedarnos con aquellas facturas que cumplen la condición.
         * Los Streams diseñan un flujo de trabajo que se ejecuta de forma unitaria item a item.
         * Busca el primer elemento cuyo importe supero los 300 euros y lo devuelve, una vez encontrado, 
         * no sigues recorriendo el resto de la lista.
         */
        Factura resultadoUnico = lista.stream().filter(e->e.getPrecio()>300).findFirst().get();
        System.out.println(resultadoUnico.getPrecio());
        
        
        Stream<Factura> variosResultados = lista.stream().filter(r->r.getDispositivo().contains("o"));
        
        variosResultados.forEach(e->System.out.println(e.getDispositivo()));
            
        
        
        
    }
    
}
