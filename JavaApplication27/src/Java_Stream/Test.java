
package Java_Stream;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 *
 * @author Ignacio
 */
public class Test {
    
    public static List<Persona> buscarTermino(String termino,List<Persona>listaPersonas){
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Persona>resultado = listaPersonas.stream().filter(
                e->e.getNombre().contains(termino) || 
                e.getApellido1().contains(termino) ||
                e.getApellido2().contains(termino) ||
               (e.isTrabajando()?"si":"no").contains(termino) ||
                e.getFechaNac().format(patron).contains(termino)
        ).collect(Collectors.toList());
        return resultado;
    }

    public static void main(String[] args) {

        //LISTADO DE FACTURAS DE DISPOSITIVOS    
        List<Factura> listaFacturas = new ArrayList<>();
        listaFacturas.add(new Factura("ordenador", 1000));
        listaFacturas.add(new Factura("movil", 300));
        listaFacturas.add(new Factura("impresora", 200));
        listaFacturas.add(new Factura("imac", 1500));
        listaFacturas.add(new Factura("torre-pc", 1280));
        listaFacturas.add(new Factura("microfono", 890));
        
        //LISTADO DE PERSONAS
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Marcos", "Martínez", "González", false, LocalDate.of(1992, 3, 15)));
        listaPersonas.add(new Persona("Carlos", "Hernández", "López", true, LocalDate.of(1985, 6, 22)));
        listaPersonas.add(new Persona("María", "Rodríguez", "Pérez", false, LocalDate.of(1990, 12, 5)));
        listaPersonas.add(new Persona("Pedro", "Hernández", "Morales", true, LocalDate.of(1988, 7, 9)));
        listaPersonas.add(new Persona("Ana", "García", "Fernández", false, LocalDate.of(1995, 11, 30)));
        
        
       
        
       
        System.out.println("Imprimir todos los dispositivos superiores a 300 Euros");
        System.out.println("-----------------------------------------------------");
        listaFacturas.stream().filter(e->e.getPrecio()>300).forEach(e->System.out.println(e));
  
        System.out.println("Imprimir todos los dispositivos que comiencen por la letra 'i' ");
        System.out.println("---------------------------------------------------------------");
        listaFacturas.stream().filter(e->e.getDispositivo().startsWith("i")).forEach(System.out::println);
        
        System.out.println("Buscamos dispositivos con un precio > 500 e inferior 1500 y lo almacenamos en una lista de tipo Factura");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        List<Factura> listaResultados = listaFacturas.stream().filter(e->e.getPrecio()>500 && e.getPrecio()<1500).collect(Collectors.toList());
        listaResultados.forEach(System.out::println);
      
        System.out.println("Buscamos un término en la lista de personas");
        buscarTermino("22/",listaPersonas).forEach(e->System.out.println(e));
       
       
       
       
        
              
     
   
            
        
        
        
    }
    
}
