public class MenuFacturacion{
	ObtenerDatos oD=new ObtenerDatos();
	ManejadorFacturas mF=new ManejadorFacturas();
	ManejadorClientes mC=new ManejadorClientes();
	ManejadorProductos mP=new ManejadorProductos();
	int idFactura;
	int idCliente;
	int idProducto;
	int contador;
	int cantidad;
	public void Menu(){
		System.out.println("Bienvenido a la vista de facturacion");
		System.out.println("Ingrese a donde quiere ir");
		System.out.println("1...Ingresar una nueva factura");
		System.out.println("2...Buscar una factura");
		System.out.println("3...Mostrar el listado completo de facturas");
		System.out.println("4...Regresar al menu");
		String op=oD.texto();
		switch(op){
			case "1":
			ingresarFactura();
			break;
			case "2":
			buscarFacturas();
			break;
			case "3":
			mostrarFacturas();
			break;
			case "4":
			MenuPrincipal.Menu();
			break;
			default:
				System.out.println("Opcion no valida");
		}
	}
	public void ingresarFactura(){
		String opcion;
		int validadorCliente=0;
		int validadorProducto=0;
		do{
		idFactura++;
		System.out.println("Ingrese el codigo del cliente");
		idCliente=Integer.parseInt(oD.texto());
		for(int i=0;i<mC.arregloClientes.size();i++){
			if(idCliente==mC.arregloClientes.get(i).getCodigo()){
				validadorCliente=1;
			break;
			}
		}
		
		System.out.println("Ingrese el codigo del producto");
		idProducto=Integer.parseInt(oD.texto());
		for(int f=0;f<mP.arregloProductos.size();f++){
			if(idProducto==mP.arregloProductos.get(f).getCodigo()){
				validadorProducto=1;
			break;
			}
		}
		
		if(validadorCliente==1 && validadorProducto==1){
			System.out.println("Ingrese la cantidad de la compra");
			cantidad=Integer.parseInt(oD.texto());
			mF.agregarFacturas(idFactura,idCliente,idProducto,cantidad);
			System.out.println("Mostrando lista de facturas....");
			System.out.println("--------------------------");
			mF.reporteFacturas();
			System.out.println("--------------------------");
		}else{
			System.out.println("El cliente o el producto ingresado no existen.");
			ingresarFactura();
		}
		
		
		System.out.println("Desea agregar otra factura?");
		System.out.println("1...si");
		System.out.println("2...no");
		opcion=oD.texto();
			}while(opcion.equals("1"));
				if(opcion.equals("2")){
					Menu();
				}else{
					System.out.println("Solo se permite ingresar valores de 1 a 2");
			 	}
	}
	public void buscarFacturas(){
		String opcion2;
		 do{
		 System.out.println("Ingrese el codigo de la factura que desea buscar");
		 idFactura=Integer.parseInt(oD.texto());
		 mF.buscarFacturas(idFactura);
		 System.out.println("Desea buscar otra factura?");
		 System.out.println("1...Si");
		 System.out.println("2...No");
		 opcion2=oD.texto();
		 }while(opcion2.equals("1"));
			if(opcion2.equals("2")){
				Menu();
			}else{
				System.out.println("Solo se permite ingresar valores del 1 al 2");
			}
	}
	public void mostrarFacturas(){
		String opcion3;
		do{
		mF.reporteFacturas();
		System.out.println("Desea regresar al menu?");
		System.out.println("1...Si");
		System.out.println("2...No");
		opcion3=oD.texto();
		}while(opcion3.equals("2"));
			if(opcion3.equals("1")){
				Menu();
			}else{
				System.out.println("Opcion no valida");
			}
	}
}