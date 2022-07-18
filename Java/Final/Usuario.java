package com.dp.usuario;
public class Usuario{
	String nombre;
	String clave;
	String rol;
	int codigo;
	public Usuario(String nombre,String clave,String rol,int codigo){
		this.nombre=nombre;
		this.clave=clave;
		this.rol=rol;
		this.codigo=codigo;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setClave(String clave){
		this.clave=clave;
	}
	public void setRol(String rol){
		this.rol=rol;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getClave(){
		return clave;
	}
	public String getRol(){
		return rol;
	}
	public int getCodigo(){
		return codigo;
	}
}