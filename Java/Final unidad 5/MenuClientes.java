public class MenuClientes{
	ObtenerDatos oD=new ObtenerDatos();
	ManejadorClientes mD=new ManejadorClientes();
	//MenuPrincipal mP=new MenuPrincipal();//
	String nombre;
	String apellido;
	String e_new;
	String seguro;
	int nit;
	int codigo;
	int p_edit;
	 public void Menu(){
		 System.out.println("Bienvenido a la vista del cliente");
		 System.out.println("Ingrese que desea hacer");
		 System.out.println("1...Ingresar nuevos clientes");
		 System.out.println("2...Modificar datos de clientes");
		 System.out.println("3...Eliminar clientes");
		 System.out.println("4...Buscar clientes");
		 System.out.println("5...Mostrar toda la lista de clientes");
		 System.out.println("6...Regresar al menu principal");
		 String op=oD.texto();
		 switch(op){
			 case "1":
			 IngresarClientes();
			 break;
			 case "2":
			 modificarClientes();
			 break;
			 case "3":
			 eliminarClientes();
			 break;
			 case "4":
			 buscarClientes();
			 break;
			 case "5":
			 mostrarClientes();
			 break;
			 case "6":
			 MenuPrincipal.Menu();
			 break;
			 default:
				System.out.println("Opcion no valida");
		 }
	 }
	 public void IngresarClientes(){
		String opcion;
		do{
		System.out.println("Ingrese el nombre del cliente");
		nombre=oD.texto();
		System.out.println("Ingrese el apellido del cliente");
		apellido=oD.texto();
		System.out.println("Ingrese el nit del cliente");
		nit=Integer.parseInt(oD.texto());
		codigo++;
		mD.agregarClientes(nombre,apellido,nit,codigo);
		System.out.println("Mostrando lista de clientes....");
		System.out.println("--------------------------");
		mD.reporteClientes();
		System.out.println("--------------------------");
		System.out.println("Desea agregar otro cliente?");
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
	 public void modificarClientes(){
		 String opcion2;
			do{
			System.out.println("--------------------------");
			mD.reporteClientes();
			System.out.println("--------------------------");
			System.out.println("Ingrese el codigo del cliente que desea modificar");
			codigo=Integer.parseInt(oD.texto());
			System.out.println("");
			System.out.println("1. Nombre");
			System.out.println("2. Apellido");
			System.out.println("3. Nit");
			System.out.print("Que parametro desea mdoificar:");
			p_edit=Integer.parseInt(oD.texto());
			System.out.print("Cual es el nuevo valor:");
			e_new=oD.texto();
			mD.modificarCliente(codigo,p_edit,e_new);
			System.out.println("Mostrando datos modificados");
			System.out.println("--------------------------");
			mD.reporteClientes();
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
	 public void mostrarClientes(){
		 String opcion1;
		 do{
		System.out.println("--------------------------");
		 mD.reporteClientes();
		System.out.println("--------------------------");
		System.out.println("Desea regresar al menu?");
		System.out.println("1...Si");
		System.out.println("2...No");
		opcion1=oD.texto();
		 }while(opcion1.equals("2"));
			if(opcion1.equals("1")){
				Menu();
			}else{
				System.out.println("Opcion no valida");
			}
	 }
	 public void eliminarClientes(){
		 String opcion3;
		do{
		System.out.println("Ingrese el codigo del cliente que desea eliminar");
		codigo=Integer.parseInt(oD.texto());
		mD.buscarClientes(codigo);
		System.out.println("Seguro que desea eliminar este cliente?");
		System.out.println("1...Si");
		System.out.println("2...No");
		seguro=oD.texto();
		switch(seguro){
		case "1":
		mD.eliminarClientes(codigo);
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
		opcion3=oD.texto();
		}while(opcion3.equals("1"));
			if(opcion3.equals("2")){
				Menu();
			}else{
				System.out.println("Solo se permite ingresar valores del 1 al 2");
			}
	 }
	 public void buscarClientes(){
		 String opcion4;
		do{
		System.out.println("Ingrese el codigo del cliente que desea buscar");
		codigo=Integer.parseInt(oD.texto());
		mD.buscarClientes(codigo);
		System.out.println("Desea buscar otro?");
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
}