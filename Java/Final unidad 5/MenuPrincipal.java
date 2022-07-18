public class MenuPrincipal{
	MenuClientes mC=new MenuClientes();
	ObtenerDatos oD=new ObtenerDatos();
	MenuProductos mP=new MenuProductos();
	public static void Menu(){
		MenuClientes mC=new MenuClientes();
		ObtenerDatos oD=new ObtenerDatos();
		MenuFacturacion mF=new MenuFacturacion();
		MenuProductos mP=new MenuProductos();
		System.out.println("Ingrese a donde quiere ir..");
		System.out.println("1...Clientres");
		System.out.println("2...Productos");
		System.out.println("3...Facturacion");
		String op=oD.texto();
		switch(op){
			case "1":
				mC.Menu();
			break;
			case "2":
				mP.Menu();
			break;
			case "3":
				mF.Menu();
			break;
			default:
			System.out.println("Opcion no valida");
		}
	}
}