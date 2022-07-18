public class MenuProductos{
	ObtenerDatos oD=new ObtenerDatos();
	ManejadorProductos mP=new ManejadorProductos();
	String nombre;
	String despricion;
	String e_new;
	String seguro;
	int cantidad;
	int precio;
	int codigo;
	int p_edit;
	 public void Menu(){
		 System.out.println("Bienvenido a la vista de los productos");
		 System.out.println("Ingrese que desea hacer");
		 System.out.println("1...Ingresar nuevos productos");
		 System.out.println("2...Modificar datos de algun producto");
		 System.out.println("3...Eliminar productos");
		 System.out.println("4...Buscar productos");
		 System.out.println("5...Mostrar todo el listado de productos");
		 System.out.println("6...Regresar al menu principal");
		 String accion=oD.texto();
		 switch(accion){
			 case "1":
			 ingresarProductos();
			 break;
			 case "2":
			 modificarProductos();
			 break;
			 case "3":
			 eliminarProductos();
			 break;
			 case "4":
			 buscarProductos();
			 break;
			 case "5":
			 mostrarProductos();
			 break;
			 case "6":
				MenuPrincipal.Menu();
			 break;
			 default:
				System.out.println("----------------");
				System.out.println("Opcion no valida");
				System.out.println("----------------");
				Menu();
		 }
	 }
	 public void ingresarProductos(){
		 String opcion;
		do{
		System.out.println("Ingrese el nombre del producto");
		nombre=oD.texto();
		System.out.println("Ingrese la despricion del producto");
		despricion=oD.texto();
		System.out.println("Ingrese la cantidad del producto");
		cantidad=Integer.parseInt(oD.texto());
		System.out.println("Ingrese el precio unitario del producto");
		precio=Integer.parseInt(oD.texto());
		codigo++;
		mP.agregarProductos(nombre,despricion,cantidad,precio,codigo);
		System.out.println("Mostrando lista de productos....");
		System.out.println("--------------------------");
		mP.reporteProductos();
		System.out.println("--------------------------");
		System.out.println("Desea agregar otro producto?");
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
	 public void modificarProductos(){
		 	String opcion2;
			do{
			System.out.println("--------------------------");
			mP.reporteProductos();
			System.out.println("--------------------------");
			System.out.println("Ingrese el codigo del producto que desea modificar");
			codigo=Integer.parseInt(oD.texto());
			System.out.println("");
			System.out.println("1. Nombre");
			System.out.println("2. despricion");
			System.out.println("3. cantidad");
			System.out.println("4.precio");
			System.out.print("Que parametro desea mdoificar:");
			p_edit=Integer.parseInt(oD.texto());
			System.out.print("Cual es el nuevo valor:");
			e_new=oD.texto();
			mP.modificarProducto(codigo,p_edit,e_new);
			System.out.println("Mostrando datos modificados");
			System.out.println("--------------------------");
			mP.reporteProductos();
			System.out.println("--------------------------");
			System.out.println("Desea modificar otro?");
			System.out.println("1...si");
			System.out.println("2...no");
			opcion2=oD.texto();
			}while(opcion2.equals("1"));
				if(opcion2.equals("2")){
					Menu();
				}else{
					System.out.println("Opcion no valida, ingrese valores entre 1 y 2");
				}
	 }
	 public void mostrarProductos(){
		String opcion3;
		 do{
		System.out.println("--------------------------");
		 mP.reporteProductos();
		System.out.println("--------------------------");
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
	 public void eliminarProductos(){
		  String opcion4;
		do{
		System.out.println("Ingrese el codigo del producto que desea eliminar");
		codigo=Integer.parseInt(oD.texto());
		mP.buscarProductos(codigo);
		System.out.println("Seguro que desea eliminar este producto?");
		System.out.println("1...Si");
		System.out.println("2...No");
		seguro=oD.texto();
		switch(seguro){
		case "1":
		mP.eliminarProductos(codigo);
		break;
		case "2":
		Menu();
		break;
		default:
			System.out.println("Solo se permite ingresar valores del 1 al 2");
		}
		System.out.println("Desea eliminar otro?");
		System.out.println("1...si");
		System.out.println("2...no");
		opcion4=oD.texto();
		}while(opcion4.equals("1"));
			if(opcion4.equals("2")){
				Menu();
			}else{
				System.out.println("Solo se permite ingresar valores del 1 al 2");
			}
	 }
	 public void buscarProductos(){
		 String opcion5;
		 do{
		 System.out.println("Ingrese el codigo del producto que desea buscar");
		 codigo=Integer.parseInt(oD.texto());
		 mP.buscarProductos(codigo);
		 System.out.println("Desea buscar otro producto?");
		 System.out.println("1...Si");
		 System.out.println("2...No");
		 opcion5=oD.texto();
		 }while(opcion5.equals("1"));
			if(opcion5.equals("2")){
				Menu();
			}else{
				System.out.println("Solo se permite ingresar valores del 1 al 2");
			}
	 }
}