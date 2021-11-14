package d_logisticaWebCompras;

import java.util.Objects;

public class ProductoMarca {
	private String marca;

	public ProductoMarca(String marca) {
		this.marca = marca;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoMarca other = (ProductoMarca) obj;
		return Objects.equals(marca, other.marca);
	}

	@Override
	public String toString() {
		return marca;
	}
}
