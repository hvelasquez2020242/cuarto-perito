package com.dp.admin;
import com.dp.datos.ObtenerDatos;
import com.dp.clientes.Clientes;
import com.dp.productos.Productos;
import com.dp.usuario.Usuario;
import com.dp.controlador.Controlador;
import com.dp.manejoc.ManejadorClientes;
import com.dp.manejop.ManejadorProductos;
public class Administrador{
	ObtenerDatos oD=new ObtenerDatos();
	ManejadorClientes mClientes=new ManejadorClientes();
	ManejadorProductos mProductos=new ManejadorProductos();
	//Login logeo1=new Login();
	Controlador cT=new Controlador();
	String nombre;
	String apellido;
	String descripcion;
	String clave;
	String e_new;
	String rol;
	String seguro;
	int nit;
	int cantidad;
	int precio;
	int codigo=99;
	int p_edit;
	public static void vistaAdministrador(){
		Administrador ad=new Administrador();
		ObtenerDatos oD=new ObtenerDatos();
		System.out.println("--------------------------");
		System.out.println("Bienvemido administrador");
		System.out.println("--------------------------");
		System.out.println("Ingrese a donde desea ir");
		System.out.println("1...Clientes");
		System.out.println("2...Productos");
		System.out.println("3...Usuarios");
		System.out.println("4...Regresar al login");
		String s1=oD.texto();
		switch(s1){
			case "1":
				ad.menuClientes();
			break;
			case "2":
				ad.menuProductos();
			break;
			case "3":
				ad.menuUsuario();
			break;
			case "4":
				Controlador.logeo();
			break;
			default:
				System.out.println("**********************");
				System.out.println("Opcion no valida");
				System.out.println("**********************");
				vistaAdministrador();
		}
	}
	
	public void menuClientes(){
		System.out.println("Que desea hacer?");
				System.out.println("1...Ingresar");
				System.out.println("2...Modificar");
				System.out.println("3...Eliminar");
				System.out.println("4...Buscar");
				System.out.println("5...Mostrar lista de clientes");
				System.out.println("6...Regresar");
				String s2=oD.texto();
					switch(s2){
						case "1":
							String opcion;
							do{
							System.out.println("Ingrese un nombre");
							nombre=oD.texto();
							System.out.println("Ingrese el apellido");
							apellido=oD.texto();
							System.out.println("Ingrese el nit del cliente");
							nit=Integer.parseInt(oD.texto());
							codigo++;
							mClientes.agregarClientes(nombre,apellido,nit,codigo);
							System.out.println("Mostrando lista de clientes....");
							System.out.println("--------------------------");
							mClientes.reporteClientes();
							System.out.println("--------------------------");
							System.out.println("Desea agregar otro cliente?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion=oD.texto();
							}while(opcion.equals("1"));
							if(opcion.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
						break;
						case "2":
							String opcion4;
							do{
							System.out.println("--------------------------");
							mClientes.reporteClientes();
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
							mClientes.modificarCliente(codigo,p_edit,e_new);
							System.out.println("Mostrando datos modificados");
							System.out.println("--------------------------");
							mClientes.reporteClientes();
							System.out.println("--------------------------");
							System.out.println("Desea modificar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion4=oD.texto();
							}while(opcion4.equals("1"));
							if(opcion4.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
							
						break;
						case "3":
							String opcion1;
							do{
							System.out.println("Ingrese el codigo del cliente que desea eliminar");
							codigo=Integer.parseInt(oD.texto());
							mClientes.buscarClientes(codigo);
							System.out.println("Seguro que desea eliminar este cliente?");
							System.out.println("1...Si");
							System.out.println("2...No");
							seguro=oD.texto();
							switch(seguro){
								case "1":
								mClientes.eliminarClientes(codigo);
								break;
								case "2":
									menuClientes();
								break;
								default:
									System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
							System.out.println("Desea eliminar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion1=oD.texto();
							}while(opcion1.equals("1"));
							if(opcion1.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "4":
							String opcion2;
							do{
							System.out.println("Ingrese el codigo del cliente que desea buscar");
							codigo=Integer.parseInt(oD.texto());
							mClientes.buscarClientes(codigo);
							System.out.println("Desea buscar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion2=oD.texto();
							}while(opcion2.equals("1"));
							if(opcion2.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "5":
						String opcion3;
						do{
							System.out.println("--------------------------");
							mClientes.reporteClientes();
							System.out.println("--------------------------");
							System.out.println("Desea regresar al menu?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion3=oD.texto();
						}while(opcion3.equals("2"));
						if(opcion3.equals("1")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "6":
							vistaAdministrador();
						break;
						default:
							System.out.println("**********************");
							System.out.println("Opcion no valida");
							System.out.println("**********************");
							menuClientes();
					}
	}
	public void menuProductos(){
		System.out.println("Que desea hacer?");
				System.out.println("1...Ingresar");
				System.out.println("2...Modificar");
				System.out.println("3...Eliminar");
				System.out.println("4...Buscar");
				System.out.println("5...Mostrar lista de productos");
				System.out.println("6...Regresar");
				String s3=oD.texto();
				switch(s3){
						case "1":
							String opcion;
							do{
							System.out.println("Ingrese el nombre del producto");
							nombre=oD.texto();
							System.out.println("Ingrese la descripcion del producto");
							descripcion=oD.texto();
							System.out.println("Ingrese la cantidad del producto");
							cantidad=Integer.parseInt(oD.texto());
							System.out.println("Ingrese el precio del producto");
							precio=Integer.parseInt(oD.texto());
							codigo++;
							mProductos.agregarProductos(nombre,descripcion,cantidad,precio,codigo);
							System.out.println("Mostrando lista de productos....");
							System.out.println("--------------------------");
							mProductos.reporteProductos();
							System.out.println("--------------------------");
							System.out.println("Desea agregar otro producto?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion=oD.texto();
							}while(opcion.equals("1"));
							if(opcion.equals("2")){
								menuProductos();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
						break;
						case "2":
							String opcion4;
							do{
							System.out.println("--------------------------");
							mProductos.reporteProductos();
							System.out.println("--------------------------");
							System.out.println("Ingrese el codigo del producto que desea modificar");
							codigo=Integer.parseInt(oD.texto());
							System.out.println("");
							System.out.println("1. Nombre");
							System.out.println("2. Descricion");
							System.out.println("3. Cantidad");
							System.out.println("3. Precio");
							System.out.print("Que parametro desea mdoificar:");
							p_edit=Integer.parseInt(oD.texto());
							System.out.print("Cual es el nuevo valor:");
							e_new=oD.texto();
							mProductos.modificarProducto(codigo,p_edit,e_new);
							System.out.println("Mostrando datos modificados");
							System.out.println("--------------------------");
							mProductos.reporteProductos();
							System.out.println("--------------------------");
							System.out.println("Desea modificar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion4=oD.texto();
							}while(opcion4.equals("1"));
							if(opcion4.equals("2")){
								menuProductos();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
						break;
						case "3":
							String opcion1;
							do{
							System.out.println("Ingrese el codigo del producto que desea eliminar");
							codigo=Integer.parseInt(oD.texto());
							mProductos.buscarProductos(codigo);
							System.out.println("Seguro que desea eliminar este producto?");
							System.out.println("1...Si");
							System.out.println("2...No");
							seguro=oD.texto();
							switch(seguro){
								case "1":
								mProductos.eliminarProductos(codigo);
								break;
								case "2":
									menuProductos();
								break;
								default:
									System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
							System.out.println("Desea eliminar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion1=oD.texto();
							}while(opcion1.equals("1"));
							if(opcion1.equals("2")){
								menuProductos();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "4":
							String opcion2;
							do{
							System.out.println("Ingrese el codigo del producto que desea buscar");
							codigo=Integer.parseInt(oD.texto());
							mProductos.buscarProductos(codigo);
							System.out.println("Desea buscar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion2=oD.texto();
							}while(opcion2.equals("1"));
							if(opcion2.equals("2")){
								menuProductos();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "5":
							String opcion3;
							do{
							System.out.println("--------------------------");
							mProductos.reporteProductos();
							System.out.println("--------------------------");
							System.out.println("Desea regresar al menu?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion3=oD.texto();
							}while(opcion3.equals("2"));
							if(opcion3.equals("1")){
								menuProductos();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "6":
							vistaAdministrador();
						break;
						default:
							System.out.println("**********************");
							System.out.println("Opcion no valida");
							System.out.println("**********************");
							menuProductos();
					}
	}
	public void menuUsuario(){
		System.out.println("Que desea hacer?");
				System.out.println("1...Ingresar");
				System.out.println("2...Modificar");
				System.out.println("3...Eliminar");
				System.out.println("4...Buscar");
				System.out.println("5...Regresar");
				String s4=oD.texto();
				switch(s4){
						case "1":
							String opcion5;
							do{
							System.out.println("Ingrese el nombre del usuario");
							nombre=oD.texto();
							System.out.println("Ingrese la clave del usuario");
							clave=oD.texto();
							System.out.println("Ingrese el rol del nuevo usuario, a=Administrador y c=Cajero");
							rol=oD.texto();
							
							if(rol.equals("a") || rol.equals("c")){
								codigo++;
								cT.ingresoUsuario(nombre,clave,rol,codigo);
								System.out.println("Mostrando lista de usuarios....");
								System.out.println("***********************");
								cT.reporteUsuarios();
								System.out.println("***********************");
							}else{
								System.out.println("El rol ingresado es invalido, ingrese a=Administrador o c=Cajero");
								rol=oD.texto();
								codigo++;
								cT.ingresoUsuario(nombre,clave,rol,codigo);
								System.out.println("Mostrando lista de usuarios....");
								System.out.println("***********************");
								cT.reporteUsuarios();
								System.out.println("***********************");
							}
							
							
							System.out.println("Desea agregar otro usuario?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion5=oD.texto();
							}while(opcion5.equals("1"));
							if(opcion5.equals("2")){
								menuUsuario();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
						break;
						case "2":
							String opcion6;
							do{
							System.out.println("--------------------------");
							cT.reporteUsuarios();
							System.out.println("--------------------------");
							System.out.println("Ingrese el codigo del usuario que desea modificar");
							codigo=Integer.parseInt(oD.texto());
							System.out.println("");
							System.out.println("1. Nombre");
							System.out.println("2. Clave");
							System.out.println("3. Rol");
							System.out.print("Que parametro desea mdoificar:");
							p_edit=Integer.parseInt(oD.texto());
							System.out.print("Cual es el nuevo valor:");
							e_new=oD.texto();
							cT.modificarUsuarios(codigo,p_edit,e_new);
							System.out.println("Mostrando datos modificados");
							System.out.println("--------------------------");
							cT.reporteUsuarios();
							System.out.println("--------------------------");
							System.out.println("Desea modificar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion6=oD.texto();
							}while(opcion6.equals("1"));
							if(opcion6.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores de 1 a 2");
							}
						break;
						case "3":
							String opcion8;
							do{
							System.out.println("Ingrese el codigo del usuario que desea eliminar");
							codigo=Integer.parseInt(oD.texto());
							cT.buscarUsuarios(codigo);
							System.out.println("Seguro que desea eliminar este usuario?");
							System.out.println("1...Si");
							System.out.println("2...No");
							seguro=oD.texto();
							switch(seguro){
								case "1":
								cT.eliminarUsuarios(codigo);
								break;
								case "2":
									menuClientes();
								break;
								default:
									System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
							System.out.println("Desea eliminar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion8=oD.texto();
							}while(opcion8.equals("1"));
							if(opcion8.equals("2")){
								menuClientes();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "4":
							String opcion7;
							do{
							System.out.println("Ingrese el codigo del usuario que desea buscar");
							codigo=Integer.parseInt(oD.texto());
							cT.buscarUsuarios(codigo);
							System.out.println("Desea buscar otro?");
							System.out.println("1...si");
							System.out.println("2...no");
							opcion7=oD.texto();
							}while(opcion7.equals("1"));
							if(opcion7.equals("2")){
								menuUsuario();
								break;
							}else{
								System.out.println("Solo se permite ingresar valores del 1 al 2");
							}
						break;
						case "5":
							vistaAdministrador();
						break;
						default:
							System.out.println("**********************");
							System.out.println("Opcion no valida");
							System.out.println("**********************");
							menuUsuario();
					}
				}
	}
