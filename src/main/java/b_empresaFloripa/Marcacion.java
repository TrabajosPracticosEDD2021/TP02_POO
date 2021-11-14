package b_empresaFloripa;

import java.time.LocalTime;
import java.util.Objects;

public class Marcacion implements Comparable<Marcacion> {
	private int numero;
	private LocalTime fechaHora;
	private MarcacionTipo tipo;
	private Empleado empleado;

	public Marcacion(int numero, LocalTime fechaHora, MarcacionTipo tipo, Empleado empleado) {
		this.numero = numero;
		this.fechaHora = fechaHora;
		this.tipo = tipo;
		this.empleado = empleado;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public LocalTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public MarcacionTipo getTipo() {
		return tipo;
	}

	public void setTipo(MarcacionTipo tipo) {
		this.tipo = tipo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public int compareTo(Marcacion o) {
		return this.fechaHora.compareTo(o.getFechaHora());
	}

	@Override
	public int hashCode() {
		return Objects.hash(empleado, fechaHora, numero, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marcacion other = (Marcacion) obj;
		return Objects.equals(empleado, other.empleado) && Objects.equals(fechaHora, other.fechaHora)
				&& numero == other.numero && tipo == other.tipo;
	}

	@Override
	public String toString() {
		return "Marcacion [numero=" + numero + ", fechaHora=" + fechaHora + ", tipo=" + tipo + ", empleado=" + empleado
				+ "]";
	}

}
