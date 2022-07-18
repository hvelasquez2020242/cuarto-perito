package com.dp.clientes;
public class Clientes{
	String nombre;
	String apellido;
	int nit;
	int codigo;
	
	public Clientes(String nombre,String apellido,int nit,int codigo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.nit=nit;
		this.codigo=codigo;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public void setNit(int nit){
		this.nit=nit;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public int getNit(){
		return nit;
	}
	public int getCodigo(){
		return codigo;
	}
}