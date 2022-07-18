package com.dp.controlador;
import java.util.ArrayList;
import com.dp.datos.ObtenerDatos;
import com.dp.usuario.Usuario;
import com.dp.cajero.Cajero;
import com.dp.admin.Administrador;
public class Controlador{
	ObtenerDatos oD=new ObtenerDatos();
	//Administrador aA=new Administrador();
	Cajero cC=new Cajero();
	public static ArrayList<Usuario> usuario=new ArrayList<Usuario>();
	Usuario user;
	
	
	public void ingresoUsuario(String nombre,String clave,String rol,int codigo){
		
		usuario.add(new Usuario(nombre,clave,rol,codigo));
	}
	
	public void usuarioIngresado(){		
		if(usuario.isEmpty()){
			usuario.add(new Usuario("Admin","admin","a",1));
			usuario.add(new Usuario("Cajero","cajero","c",2));
		}else{
			// Sigue con el flujo
		}
		System.out.println("--------------------------");
		System.out.println("Bienvenido!");
		reporteUsuarios();
		System.out.println("--------------------------");
	}
	public static void logeo(){
		ObtenerDatos oD=new ObtenerDatos();
		Controlador co=new Controlador();
		co.usuarioIngresado();
		String nombre;
		String clave;
		System.out.println("Ingrese el nombre");
		nombre=oD.texto();
		System.out.println("Ingrese la clave");
		clave=oD.texto();
		co.autentificacion(nombre,clave);
	}
	public void autentificacion(String nombre,String clave){
		int contador=0;
		for(int i=0; i<usuario.size();i++){
			
			if((usuario.get(i).getNombre().equals(nombre))&&(usuario.get(i).getClave().equals(clave))){
				if(usuario.get(i).getRol().equals("a")){
					Administrador.vistaAdministrador();
					break;
				}else{
					cC.vistaCajero();
					break;
				}
			}else{
				contador++;
			}
		}
		if(contador==usuario.size()){
			System.out.println("Usuario o clave equivocada");
			logeo();
		}
	}
	public void reporteUsuarios(){
		for(int i=0;i<usuario.size();i++){
			System.out.println("Usuario:"+usuario.get(i).getNombre()+" "+"Clave:"+usuario.get(i).getClave()+" "+"Rol:"+usuario.get(i).getRol()+" "+"Codigo:"+usuario.get(i).getCodigo());
		}
	}
	public void modificarUsuarios(int codigo,int p_edit, String e_new){
		
		for(int i=0;i<usuario.size();i++){
			if(codigo==usuario.get(i).getCodigo()){
				
				System.out.println("Usuario:"+usuario.get(i).getNombre()+" "+"Clave:"+usuario.get(i).getClave()+" "+"Rol:"+usuario.get(i).getRol()+" "+"Codigo:"+usuario.get(i).getCodigo());
				
				if(p_edit==1){
					usuario.get(i).setNombre(e_new);
				}else if(p_edit==2){
					usuario.get(i).setClave(e_new);
				}else if(p_edit==3){
					usuario.get(i).setRol(e_new);
				}
				
				
				
				
				System.out.println("Dato modificado....");
				break;
			}else{
				
			}
		}
	}
	public void buscarUsuarios(int codigo){
		int contador=0;
		
		for(int i=0;i<usuario.size();i++){
			if(codigo==usuario.get(i).getCodigo()){
				System.out.println("Se encontro....");
				System.out.println("--------------------------");
				System.out.println("Usuario:"+usuario.get(i).getNombre()+" "+"Clave:"+usuario.get(i).getClave()+" "+"Rol:"+usuario.get(i).getRol()+" "+"Codigo:"+usuario.get(i).getCodigo());
				System.out.println("--------------------------");
				break;
			}else{
				contador++;
			}
		}
		if(contador==usuario.size()){
			System.out.println("Cliente no existente");
		}
	}
	public void eliminarUsuarios(int codigo){
		int contador1=0;
		
		for(int i=0;i<usuario.size();i++){
			if(codigo==usuario.get(i).getCodigo()){
				usuario.remove(i);
				System.out.println("Dato eliminado....");
				break;
			}else{
				contador1++;
			}
		}
		if(contador1==usuario.size()){
			System.out.println("Cliente no existente");
		}
	}
	
	
}