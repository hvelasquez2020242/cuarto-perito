package com.dp.productos;
public class Productos{
	String nombre;
	String descripcion;
	int cantidad;
	int precio;
	int codigo;
	
	public Productos(String nombre,String descripcion,int cantidad,int precio,int codigo){
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.cantidad=cantidad;
		this.precio=precio;
		this.codigo=codigo;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public void setPrecio(int precio){
		this.precio=precio;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getDescripcion(){
		return descripcion;
	}
	public int getCantidad(){
		return cantidad;
	}
	public int getPrecio(){
		return precio;
	}
	public int getCodigo(){
		return codigo;
	}
}