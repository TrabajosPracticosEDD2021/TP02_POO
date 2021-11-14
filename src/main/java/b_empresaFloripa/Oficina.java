package b_empresaFloripa;

import java.time.LocalTime;
import java.util.Objects;

public class Oficina {
	private String nombre;
	private LocalTime horaEntrada, horaSalida;

	public Oficina(String nombre, LocalTime horaEntrada, LocalTime horaSalida) {
		this.nombre = nombre;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horaEntrada, horaSalida, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oficina other = (Oficina) obj;
		return Objects.equals(horaEntrada, other.horaEntrada) && Objects.equals(horaSalida, other.horaSalida)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Oficina [nombre=" + nombre + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + "]";
	}

}
