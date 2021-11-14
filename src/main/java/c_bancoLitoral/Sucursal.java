package c_bancoLitoral;

import java.util.Objects;

public class Sucursal {
	private String nombre, ubicacion;

	public Sucursal(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getUbicacion() {
		return ubicacion;
	}

	protected void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, ubicacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sucursal other = (Sucursal) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(ubicacion, other.ubicacion);
	}

	@Override
	public String toString() {
		return "Sucursal [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
	}
}
