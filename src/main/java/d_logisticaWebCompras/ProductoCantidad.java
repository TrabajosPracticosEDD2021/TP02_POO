package d_logisticaWebCompras;

import java.util.Objects;

public class ProductoCantidad {
	private int cantidad;
	private Producto producto;

	public ProductoCantidad(int cantidad, Producto producto) {
		this.cantidad = cantidad;
		this.producto = producto;
	}

	protected int getCantidad() {
		return cantidad;
	}

	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	protected Producto getProducto() {
		return producto;
	}

	protected void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoCantidad other = (ProductoCantidad) obj;
		return Objects.equals(producto, other.producto);
	}

	@Override
	public String toString() {
		return "Producto: " + producto + ", Cantidad: " + cantidad;
		
	}

}
