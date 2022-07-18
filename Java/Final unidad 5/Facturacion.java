public class Facturacion{
	int idFactura;
	int idCliente;
	int idProducto;
	int cantidad;
	public Facturacion(int idFactura,int idCliente,int idProducto,int cantidad){
		this.idFactura=idFactura;
		this.idCliente=idCliente;
		this.idProducto=idProducto;
		this.cantidad=cantidad;
	}
	public void setIdFactura(int idFactura){
		this.idFactura=idFactura;
	}
	public void setIdCliente(int idCliente){
		this.idCliente=idCliente;
	}
	public void setIdProducto(int idProducto){
		this.idProducto=idProducto;
	}
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}
	public int getIdFactura(){
		return idFactura;
	}
	public int getIdCliente(){
		return idCliente;
	}
	public int getIdProducto(){
		return idProducto;
	}
	public int getCantidad(){
		return cantidad;
	}
}