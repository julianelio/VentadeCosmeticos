
package cosmeticos;


public class Cosmeticos {

    
    public static void main(String[] args) {
      
                
                    // GENERAR CLIENTES
                
       Clientes miCliente1 = new Clientes();
       miCliente1.nombre = "Sandra";
       miCliente1.direccion = "calle 148";
       miCliente1.metodoPago = "Tarjeta";
       miCliente1.mail ="sandra@outllok.com";
       
       Clientes miCliente2 = new Clientes();
       miCliente2.nombre = "Camila";
       miCliente2.direccion = "calle 21";
       miCliente2.metodoPago = "Efectivo";
       miCliente2.mail ="camila@outllok.com";
        
       System.out.println(miCliente1);
       

    //PRODUCTOS
       
       Productos miProducto1 =new Productos();
       miProducto1.nombre = "Lapiz labial";
       miProducto1.precio = 300;
       miProducto1.descripcion =" rojo cereza";
       
      
       
       Productos miProducto2 =new Productos();
       miProducto2.nombre = "Base";
       miProducto2.precio = 400;
       miProducto2.descripcion =" base para maquillar";
       
        
        Productos miProducto3 =new Productos();
       miProducto3.nombre = "crema";
       miProducto3.precio = 600;
       miProducto3.descripcion =" Crema facial";
       
        
        Productos miProducto4 =new Productos();
       miProducto4.nombre = "Delineador";
       miProducto4.precio = 800;
       miProducto4.descripcion =" Delineador exclusive";
        System.out.println(miProducto4);
        
        
        
      //VENTA
       Ventas  miVenta1 = new Ventas();
      miVenta1.miCliente = miCliente1;
      miVenta1.fecha="15/06/20";
      
      
     //miVenta1.listadoDeProductos.add();
      VentaDetalle detalle1 = new VentaDetalle();
      detalle1.miProducto = miProducto1;
      
      VentaDetalle detalle2 = new VentaDetalle();
      detalle2.miProducto = miProducto2;
      
      VentaDetalle detalle3 = new VentaDetalle();
      detalle3.miProducto = miProducto3;
      
      VentaDetalle detalle4 = new VentaDetalle();
      detalle4.miProducto = miProducto4;
      
      miVenta1.listadoDeProductos.add(detalle1);
      miVenta1.listadoDeProductos.add(detalle2);
      miVenta1.listadoDeProductos.add(detalle3);
      miVenta1.listadoDeProductos.add(detalle4);
     /*  Ventas  miVenta2 = new Ventas();
      miVenta2.miCliente = miCliente2;
      miVenta2.miProducto = miProducto2;
      miVenta2.fecha="15/06/20";
      */
        System.out.println(miVenta1);
    }
    
}
