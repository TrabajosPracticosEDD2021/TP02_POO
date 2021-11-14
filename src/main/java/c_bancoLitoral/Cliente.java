package c_bancoLitoral;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
	private String apellido, nombre, documento;
	private ClienteTipoEnum tipo;

	public Cliente(String apellido, String nombre, String documento, ClienteTipoEnum tipo) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
		this.tipo = tipo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public ClienteTipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(ClienteTipoEnum tipo) {
		this.tipo = tipo;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.documento.compareTo(o.getDocumento());
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(documento, other.documento);
	}

	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", nombre=" + nombre + ", documento=" + documento
				+ ", tipo=" + tipo + "]";
	}
}
