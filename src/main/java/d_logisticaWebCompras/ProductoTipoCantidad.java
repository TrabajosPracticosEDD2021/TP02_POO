package d_logisticaWebCompras;

public class ProductoTipoCantidad {
	private int cantidad;
	private ProductoTipo tipo;

	public ProductoTipoCantidad(int cantidad, ProductoTipo tipo) {
		this.cantidad = cantidad;
		this.tipo = tipo;
	}

	protected int getCantidad() {
		return cantidad;
	}

	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	protected ProductoTipo getTipo() {
		return tipo;
	}

	protected void setTipo(ProductoTipo tipo) {
		this.tipo = tipo;
	}

	public ProductoTipoCantidad(ProductoTipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tipo de producto: " + tipo + ", Cantidad: " + cantidad;
	}

}
