package b_empresaFloripa;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
	private int legajo;
	private String nombre, apellido, dni;
	private Oficina oficina;

	public Empleado(int legajo, String nombre, String apellido, String dni, Oficina oficina) {
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.oficina = oficina;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Oficina getOficina() {
		return oficina;
	}

	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public int compareTo(Empleado o) {
		return Integer.compare(legajo, o.getLegajo());
	}

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
}
