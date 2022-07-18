public class Calculadora{
	public void calculadora(){
		System.out.println("Elija que operacion quiere ejecutar");
		System.out.println("1 para suma");
		System.out.println("2 para resta");
		System.out.println("3 Para division");
		System.out.println("4 Para multiplicacion");
		ObtenerDatos od=new ObtenerDatos();
		String operacion=null;
		operacion=od.texto();//ENTRADA DE TEXTO-STRING
		System.out.println("Usted selecciono: " + operacion);
		System.out.println("Ingrese el valor de a");
		String aString=od.texto();//ENTRADA DE TEXTO-STRING
		double a=Double.parseDouble(aString);//CONVERTIDOR DE FORMATO STRING A DOUBLE
		System.out.println("Ingrese el valor de b");
		String bString=od.texto();//ENTRADA DE TEXTO-STRING
		double b=Double.parseDouble(bString);//CONVERTIDOR DE FORMATO STRING A DOUBLE
		double total=0;
		switch (operacion){
			case "1":
				total=a+b;
				System.out.println("El resultado de la suma es:" + total);
				break;
			case "2":
				total=a-b;
				System.out.println("El resultado de la resta es:" + total);
				break;
			case "3":
				if(b==0){
					System.out.println("MATCH ERROR");
				}else{
				total=a/b;
				System.out.println("El resultado de la division es:" + total);
				}
				break;
			case "4":
				total=a*b;
				System.out.println("El resultado de la multiplicacion es:" + total);
				break;
			default:
				System.out.println("Opcion no valida");
		}
	}
}