package d_logisticaWebCompras;

import java.util.Objects;

public class Producto {
	private ProductoTipo tipo;
	private ProductoMarca marca;
	private String productoModelo;

	public Producto(ProductoTipo tipo, ProductoMarca marca, String productoModelo) {
		this.tipo = tipo;
		this.marca = marca;
		this.productoModelo = productoModelo;
	}

	protected ProductoTipo getTipo() {
		return tipo;
	}

	protected void setTipo(ProductoTipo tipo) {
		this.tipo = tipo;
	}

	protected ProductoMarca getMarca() {
		return marca;
	}

	protected void setMarca(ProductoMarca marca) {
		this.marca = marca;
	}

	protected String getProductoModelo() {
		return productoModelo;
	}

	protected void setProductoModelo(String productoModelo) {
		this.productoModelo = productoModelo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, productoModelo, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(marca, other.marca)
				&& Objects.equals(productoModelo, other.productoModelo)
				&& Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "[tipo=" + tipo + ", marca=" + marca + ", productoModelo=" + productoModelo + "]";
	}
}
