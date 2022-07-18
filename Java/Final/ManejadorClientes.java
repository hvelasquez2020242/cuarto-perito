package com.dp.manejoc;
import com.dp.clientes.Clientes;
import java.util.ArrayList;
public class ManejadorClientes{
	public static ArrayList<Clientes> arregloClientes=new ArrayList<Clientes>();
	Clientes clientes;
	public void agregarClientes(String nombre,String apellido,int nit,int codigo){
		arregloClientes.add(new Clientes(nombre,apellido,nit,codigo));
	}
	public void reporteClientes(){
		
		if(arregloClientes.isEmpty()){
			System.out.println("La lista de clientes esta vacia");
		}else{
			for(int i=0;i<arregloClientes.size();i++){
				System.out.println("Nombre:"+arregloClientes.get(i).getNombre()+" "+"Apellido:"+arregloClientes.get(i).getApellido()+" "+"Nit:"+arregloClientes.get(i).getNit()+" "+"Codigo:"+arregloClientes.get(i).getCodigo());
			}
		}	
		
	}
	public void buscarClientes(int codigo){
		int contador=0;
		int a=0;
		for(int i=0;i<arregloClientes.size();i++){
			if(codigo==arregloClientes.get(i).getCodigo()){
				System.out.println("Se encontro....");
				System.out.println("--------------------------");
				System.out.println("Nombre:"+arregloClientes.get(i).getNombre()+" "+"Apellido:"+arregloClientes.get(i).getApellido()+" "+"Nit:"+arregloClientes.get(i).getNit()+" "+"Codigo:"+arregloClientes.get(i).getCodigo());
				System.out.println("--------------------------");
				a=1;
				break;
			}else{
				contador++;
			}
		}
		if(a==0){
			System.out.println("Cliente no existente");
		}
	}
	
	public void modificarCliente(int codigo,int p_edit, String e_new){
		
		for(int i=0;i<arregloClientes.size();i++){
			if(codigo==arregloClientes.get(i).getCodigo()){
				
				System.out.println("Nombre:"+arregloClientes.get(i).getNombre()+" "+"Apellido:"+arregloClientes.get(i).getApellido()+" "+"Nit:"+arregloClientes.get(i).getNit()+" "+"Codigo:"+arregloClientes.get(i).getCodigo());
				
				if(p_edit==1){
					arregloClientes.get(i).setNombre(e_new);
				}else if(p_edit==2){
					arregloClientes.get(i).setApellido(e_new);
				}else if(p_edit==3){
					arregloClientes.get(i).setNit(Integer.parseInt(e_new));
				}
				
				
				
				
				System.out.println("Dato modificado....");
				break;
			}else{
				
			}
		}
	}
	
	public void eliminarClientes(int codigo){
		int contador1=0;
		int b=0;
		
		for(int i=0;i<arregloClientes.size();i++){
			if(codigo==arregloClientes.get(i).getCodigo()){
				arregloClientes.remove(i);
				System.out.println("Dato eliminado....");
				b=1;
				break;
			}else{
				contador1++;
			}
		}
		if(b==1){
			System.out.println("Cliente no existente");
		}
	}
}