package com.dp.datos;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class ObtenerDatos{
	
	public String texto(){
		String texto=null;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		try{
		texto=bf.readLine();
		}catch(IOException io){
			System.out.println("Error de entrada y salida");
			System.exit(1);
		}
		return texto;
	}
}