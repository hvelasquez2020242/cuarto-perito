import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ObtenerDatos{
	
	public String texto(){ 
		String dato1=null;
		BufferedReader bf=new BufferedReader (new InputStreamReader(System.in));
		try{
			dato1=bf.readLine();
		}catch(IOException e){
			System.out.println("Error de IOE");
			System.exit(1);
		}
		return dato1;
	}

}