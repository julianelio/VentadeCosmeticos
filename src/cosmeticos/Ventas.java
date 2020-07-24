
package cosmeticos;

import java.util.ArrayList;


public class Ventas {
   // A quien le vendemos
    Clientes miCliente;
     String fecha;
    
    //Que le vendemos? hacer una lista de productos
   
    ArrayList <VentaDetalle> listadoDeProductos = new ArrayList <>();

    @Override
    public String toString() {
        return "Ventas{" + "miCliente=" + miCliente + ", fecha=" + fecha + ", listadoDeProductos=" + listadoDeProductos + '}';
    }

    
    

    
    
    
    
}
