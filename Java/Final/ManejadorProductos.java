package com.dp.manejop;
import com.dp.productos.Productos;
import java.util.ArrayList;
public class ManejadorProductos{
	public static ArrayList<Productos> arregloProductos=new ArrayList<Productos>();
	Productos productos;
	public void agregarProductos(String nombre,String descripcion,int cantidad,int precio,int codigo){
		arregloProductos.add(new Productos(nombre,descripcion,cantidad,precio,codigo));
	}
	public void reporteProductos(){
		if(arregloProductos.isEmpty()){
			System.out.println("La lista de productos esta vacia");
		}else{
		for(int i=0;i<arregloProductos.size();i++){
			System.out.println("Nombre:"+arregloProductos.get(i).getNombre()+" "+"Descripcion:"+arregloProductos.get(i).getDescripcion()+" "+"Cantidad:"+arregloProductos.get(i).getCantidad()+" "+"Precio:$"+arregloProductos.get(i).getPrecio()+" "+"Codigo:"+arregloProductos.get(i).getCodigo());
			}
		}
	}
	public void buscarProductos(int codigo){
		int contador=0;
		
		for(int i=0;i<arregloProductos.size();i++){
			if(codigo==arregloProductos.get(i).getCodigo()){
				System.out.println("Se encontro....");
				System.out.println("--------------------------");
				System.out.println("Nombre:"+arregloProductos.get(i).getNombre()+" "+"Descripcion:"+arregloProductos.get(i).getDescripcion()+" "+"Cantidad:"+arregloProductos.get(i).getCantidad()+" "+"Precio:$"+arregloProductos.get(i).getPrecio()+" "+"Codigo:"+arregloProductos.get(i).getCodigo());
				System.out.println("--------------------------");
				break;
			}else{
				contador++;
			}
		}
		if(contador==arregloProductos.size()){
			System.out.println("Cliente no existente");
		}
	}
	public void modificarProducto(int codigo,int p_edit, String e_new){
		
		for(int i=0;i<arregloProductos.size();i++){
			if(codigo==arregloProductos.get(i).getCodigo()){
				
				System.out.println("Nombre:"+arregloProductos.get(i).getNombre()+" "+"Descripcion:"+arregloProductos.get(i).getDescripcion()+" "+"Cantidad:"+arregloProductos.get(i).getCantidad()+" "+"Precio:$"+arregloProductos.get(i).getPrecio()+" "+"Codigo:"+arregloProductos.get(i).getCodigo());
				
				if(p_edit==1){
					arregloProductos.get(i).setNombre(e_new);
				}else if(p_edit==2){
					arregloProductos.get(i).setDescripcion(e_new);
				}else if(p_edit==3){
					arregloProductos.get(i).setCantidad(Integer.parseInt(e_new));
				}else if(p_edit==4){
					arregloProductos.get(i).setPrecio(Integer.parseInt(e_new));
				}
				
				
				
				
				System.out.println("Dato modificado....");
				break;
			}else{
				
			}
		}
	}
	public void eliminarProductos(int codigo){
		int contador1=0;
		
		for(int i=0;i<arregloProductos.size();i++){
			if(codigo==arregloProductos.get(i).getCodigo()){
				arregloProductos.remove(i);
				System.out.println("Dato eliminado....");
				break;
			}else{
				contador1++;
			}
		}
		if(contador1==arregloProductos.size()){
			System.out.println("Cliente no existente");
		}
	}
}