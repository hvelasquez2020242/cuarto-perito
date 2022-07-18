public class TablasFibonacci{
	public void tablas(String abc){
		switch(abc){ //IDENTIFICADOR DE OPCION EN MENU.JAVA
			case "2":
				System.out.println("Escoja con que metodo quiere ejecutar la tabla");
				System.out.println("1...While");
				System.out.println("2...Dowhile");
				ObtenerDatos od=new ObtenerDatos();
				String forma=null;
				forma=od.texto();
				System.out.println("Usted selecciono la forma: " + forma);
				switch (forma){
					case "1":
						System.out.println("Elija que tabla quiere mostrar");
						String aString=od.texto();//ENTRADA DE TEXTO-STRING
						int a=Integer.parseInt(aString);//CONVERTIDOR DE FORMATO STRING A INT
						int limite=0;
						System.out.println("Usted escogio mostrar la tabla del " + a);
						while (limite!=11){
							System.out.println(a +"*" +limite +"=" + a*limite);
							limite++;
						}
					break;
					case "2":
						System.out.println("Elija que tabla quiere mostrar");
						String a2String=od.texto();//ENTRADA DE TEXTO-STRING
						int a2=Integer.parseInt(a2String); //CONVERTIDOR DE FORMATO STRING A INT   
						int limite2=0;
						do{
							System.out.println(a2 +"*" +limite2 +"=" +a2*limite2);
							limite2++;
						}while(limite2!=11);
					break;
					default:
						System.out.println("Opcion no valida");
				}
			break;
			case "3":
				System.out.println("Escoja con que metodo quiere ejecutar la tabla");
				System.out.println("1...While");
				System.out.println("2...Dowhile");
				ObtenerDatos od2=new ObtenerDatos();
				String forma2=null;//ENTRADA DE TEXTO
				forma2=od2.texto();
				System.out.println("Usted selecciono la forma: " + forma2);
				switch (forma2){
					case "1":
						System.out.println("Elija que tabla quiere mostrar");
						String a3String=od2.texto();//ENTRADA DE TEXTO-STRING
						int a3=Integer.parseInt(a3String);//CONVERTIDOR DE FORMATO STRING A INT  
						System.out.println("Escoja el limite de la tabla");
						String b3String=od2.texto();//ENTRADA DE TEXTO-STRING
						int b3=Integer.parseInt(b3String);//CONVERTIDOR DE FORMATO STRING A INT  
						System.out.println("Usted escogio mostrar la tabla del " + a3);
						System.out.println("Usted escogio un limite de  " + b3);
						int limite3=0;
						while (limite3<=b3){
							System.out.println(a3 +"*" +limite3 +"=" + a3*limite3);
							limite3++;
					break;
						}
					case "2":
						System.out.println("Elija que tabla quiere mostrar");
						String a4String=od2.texto();//ENTRADA DE TEXTO-STRING
						int a4=Integer.parseInt(a4String);//CONVERTIDOR DE FORMATO STRING A INT  
						System.out.println("Escoja el limite de la tabla");
						String b4String=od2.texto();//ENTRADA DE TEXTO-STRING
						int b4=Integer.parseInt(b4String);//CONVERTIDOR DE FORMATO STRING A INT  
						System.out.println("Usted escogio mostrar la tabla del " + a4);
						System.out.println("Usted escogio un limite de  " + b4);
						int limite4=0;
						do{
							System.out.println(a4 +"*" +limite4 +"=" +a4*limite4);
							limite4++;
						}while(limite4<=b4);
					break;
					default:
						System.out.println("Opcion no valida");
					break;
				}
			break;
			case "4":
				System.out.println("Elija con que metodo quiere ejecutar la sentencia de fibonacci");
				System.out.println("1...While");
				System.out.println("2...DoWhile");
				ObtenerDatos od3=new ObtenerDatos();
				String forma3=null;//ENTRADA DE TEXTO-STRING
				forma3=od3.texto();//CONVERTIDOR DE FORMATO STRING A INT  
				System.out.println("Usted selecciono la forma: " + forma3);
				System.out.println("Escoja el limite de la sentencia");
				String a5String=od3.texto();
				int a5=Integer.parseInt(a5String);
				System.out.println("Usted escogio un limite de " +a5);
				switch(forma3){
					case "1":
						int af=0;
						int bf=1;
						int ef=1;
						int cf=0;
						while(ef<=a5){
							System.out.println(af);
							cf=af+bf;
							af=bf;
							bf=cf; 
							ef++;
						}
					break;
					case "2":
						int af2=0;
						int bf2=1;
						int ef2=1;
						int cf2=0;
						do{
							System.out.println(af2);
							cf2=af2+bf2;
							af2=bf2;
							bf2=cf2; 
							ef2++;
						}while(ef2<=a5);
					break;
					default:
						System.out.println("Opcion no valida");
				}
			break;
			default:
				System.out.println("Opcion no valida");
			
		}
	}	
}
