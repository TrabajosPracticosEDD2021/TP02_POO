package d_logisticaWebCompras;

import java.util.Objects;

public class ProductoTipo {
	private String descripcion;

	public ProductoTipo(String descripcion) {
		this.descripcion = descripcion;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoTipo other = (ProductoTipo) obj;
		return Objects.equals(descripcion, other.descripcion);
	}

	@Override
	public String toString() {
		return descripcion;
	}
}
