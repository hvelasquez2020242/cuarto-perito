import java.util.ArrayList;
public class ManejadorFacturas{
	ManejadorClientes mC=new ManejadorClientes();
	ManejadorProductos mP=new ManejadorProductos();
	String nombrex;
	int idFactura;
	int idCliente;
	int idProducto;
	int cantidad;
	int validadorCliente;
	int validadorProducto;
	int validadorCantidad;
	public static ArrayList<Facturacion> arregloFacturas=new ArrayList<Facturacion>();
	Facturacion facturacion;
	public void agregarFacturas(int idFactura,int idCliente,int idProducto,int cantidad){
		arregloFacturas.add(new Facturacion(idFactura,idCliente,idProducto,cantidad));
	}
	public void reporteFacturas(){
		if(arregloFacturas.isEmpty()){
			System.out.println("La lista de facturas esta vacia");
		}else{
		for(int i=0;i<arregloFacturas.size();i++){
			System.out.println("--------------------------");
			System.out.println("id_factura: "+arregloFacturas.get(i).getIdFactura()+" id_cliente: "+arregloFacturas.get(i).getIdCliente()+" nombre del cliente: "+mC.arregloClientes.get(i).getNombre()+" apellido del cliente: "+mC.arregloClientes.get(i).getApellido()+" id_producto: "+arregloFacturas.get(i).getIdProducto()
			+" producto: "+mP.arregloProductos.get(i).getNombre()+" Cantidad: "+arregloFacturas.get(i).getCantidad()+" Total: $"+arregloFacturas.get(i).getCantidad()*mP.arregloProductos.get(i).getPrecio());
			System.out.println("--------------------------");
			}
		}
	}
	public void buscarFacturas(int idFactura){
		int contador=0;
		
		for(int i=0;i<arregloFacturas.size();i++){
			if(idFactura==arregloFacturas.get(i).getIdFactura()){
				System.out.println("Se encontro....");
				System.out.println("--------------------------");
				System.out.println("id_factura: "+arregloFacturas.get(i).getIdFactura()+" id_cliente: "+arregloFacturas.get(i).getIdCliente()+" nombre del cliente: "+mC.arregloClientes.get(i).getNombre()+" apellido del cliente: "+mC.arregloClientes.get(i).getApellido()+" id_producto: "+arregloFacturas.get(i).getIdProducto()+
			" producto: "+mP.arregloProductos.get(i).getNombre()+" Cantidad: "+arregloFacturas.get(i).getCantidad()+" Total: $"+arregloFacturas.get(i).getCantidad()*mP.arregloProductos.get(i).getPrecio());
				System.out.println("--------------------------");
				break;
			}else{
				contador++;
			}
		}
		if(contador==arregloFacturas.size()){
			System.out.println("Facura no existente");
		}
	}
}