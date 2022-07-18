public class Menu{
	public void menuPrincipal(){
		System.out.println("Escoja lo que quiera ejecutar");
		System.out.println("1...Calculadora");
		System.out.println("2...Tabla de multiplicar con limite de 10");
		System.out.println("3...Tabla de multiplicar con eleccion de limite");
		System.out.println("4...Sentencia de fibonacci");
		ObtenerDatos od=new ObtenerDatos();
		String seleccion=null;
		seleccion=od.texto();
		System.out.println("Usted selecciono: " + seleccion);
		switch(seleccion){ //ESTE SWITCH ES PARA DISTINGUIR QUE ESCOGE Y LO LLEVE A SU RESPECTIVO LUGAR
			case "1":
				Calculadora c=new Calculadora();
				c.calculadora();
			break;
			case "2":
				TablasFibonacci t=new TablasFibonacci();
				t.tablas(seleccion);//SIRVE PARA LA ELECCION DE LA OPCION EN TABLASFIBONACCI- EN SWITCH(abc)
			break;
			case "3":
				TablasFibonacci t2=new TablasFibonacci();
				t2.tablas(seleccion);//SIRVE PARA LA ELECCION DE LA OPCION EN TABLASFIBONACCI- EN SWITCH(abc)
			break;
			case "4":
				TablasFibonacci t3=new TablasFibonacci();
				t3.tablas(seleccion);//SIRVE PARA LA ELECCION DE LA OPCION EN TABLASFIBONACCI- EN SWITCH(abc)
			break;
			default:
				System.out.println("Opcion no valida");
			break;
		}
	}
}