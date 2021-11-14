package d_logisticaWebCompras;

import java.util.Objects;

public class MovimientoDetalle {
	private Producto producto;
	private int cantidad;

	public MovimientoDetalle(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	protected Producto getProducto() {
		return producto;
	}

	protected void setProducto(Producto producto) {
		this.producto = producto;
	}

	protected int getCantidad() {
		return cantidad;
	}

	protected void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, producto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovimientoDetalle other = (MovimientoDetalle) obj;
		return cantidad == other.cantidad && Objects.equals(producto, other.producto);
	}

	@Override
	public String toString() {
		return "MovimientoDetalle [producto=" + producto + ", cantidad=" + cantidad + "]";
	}
}
