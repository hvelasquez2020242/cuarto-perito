package com.dp.cajero;
import com.dp.clientes.Clientes;
import com.dp.productos.Productos;
import com.dp.datos.ObtenerDatos;
import com.dp.controlador.Controlador;
import com.dp.manejoc.ManejadorClientes;
import com.dp.manejop.ManejadorProductos;
public class Cajero{
	ObtenerDatos oD=new ObtenerDatos();
	ManejadorClientes mClientes=new ManejadorClientes();
	ManejadorProductos mProductos=new ManejadorProductos();
		String nombre;
		String apellido;
		String descripcion;
		int nit;
		int cantidad;
		int precio;
		int codigo=99;
	public void vistaCajero(){
		System.out.println("--------------------------");
		System.out.println("Bienvenido cajero");
		System.out.println("--------------------------");
		System.out.println("Ingrese a donde desea ir");
		System.out.println("1...Clientes");
		System.out.println("2...Productos");
		System.out.println("3...Regresar al login");
		String s1=oD.texto();
		switch(s1){
			case "1":
				menuClientes();
			break;
			case "2":
				menuProductos();
			break;
			case "3":
				Controlador.logeo();
			break;
			default:
				System.out.println("**********************");
				System.out.println("Opcion invalida");
				System.out.println("**********************");
				vistaCajero();
		}
	}
	public void menuClientes(){
		System.out.println("Que desea hacer?");
				System.out.println("1...Ingresar");
				System.out.println("2...Buscar");
				System.out.println("3...Mostrar lista de clientes");
				System.out.println("4...Regresar");
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
					case "3":
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
					case "4":
					vistaCajero();
					break;
					default:
					System.out.println("**********************");
					System.out.println("Opcion invalida");
					System.out.println("**********************");
					menuClientes();
				}
	}
	public void menuProductos(){
				System.out.println("Que desea hacer?");
				System.out.println("1...Ingresar");
				System.out.println("2...Buscar");
				System.out.println("3...Mostrar lista de productos");
				System.out.println("4...Regresar");
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
							System.out.println("Desea agregar otro cliente?");
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
							String opcion2;
							do{
							System.out.println("Ingrese el codigo del cliente que desea buscar");
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
						case "3":
							String opcion3;
							do{
							mProductos.reporteProductos();
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
						case "4":
						menuProductos();
						break;
						default:
							System.out.println("**********************");
							System.out.println("Opcion invalida");
							System.out.println("**********************");
								menuProductos();
					}
	}
}