
package Java_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Ignacio
 */
public class Test {


    public static void main(String[] args) {

        List<Factura> listaFacturas = new ArrayList<>();
        
        listaFacturas.add(new Factura("ordenador", 1000));
        listaFacturas.add(new Factura("movil", 300));
        listaFacturas.add(new Factura("impresora", 200));
        listaFacturas.add(new Factura("imac", 1500));
        listaFacturas.add(new Factura("torre-pc", 1280));
        listaFacturas.add(new Factura("microfono", 890));
        
        
        
        
        
        
        
        System.out.println("Imprimir todos los dispositivos superiores a 300 Euros");
        System.out.println("-----------------------------------------------------");
        Stream<Factura> resultadoA = listaFacturas.stream().filter(e->e.getPrecio()>300);
        resultadoA.forEach(e->System.out.println(e.getDispositivo()+": "+e.getPrecio()));
        
        
        System.out.println("Imprimir todos los dispositivos que comiencen por la letra 'i' ");
        System.out.println("---------------------------------------------------------------");
        Stream<Factura> resultadoB = listaFacturas.stream().filter(e->e.getDispositivo().startsWith("i"));
        resultadoB.forEach(e->System.out.println(e.getDispositivo()));
        
        System.out.println("Buscamos dispositivos con un precio > 500 e inferior 1500 y lo almacenamos en una lista de tipo Factura");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        List<Factura> resultadosBusqueda = listaFacturas.stream().filter(e->e.getPrecio()>500 && e.getPrecio()<1500).collect(Collectors.toList());
        resultadosBusqueda.forEach(System.out::println);
        
              
     
   
            
        
        
        
    }
    
}
