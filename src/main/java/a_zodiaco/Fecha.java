package a_zodiaco;

import java.util.Objects;

public class Fecha implements Comparable<Fecha> {
	private int dia, mes, anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	public Fecha(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anio == other.anio && dia == other.dia && mes == other.mes;
	}

	@Override
	public int compareTo(Fecha o) {
		int res = Integer.compare(mes, o.getMes());

		if (res == 0) {
			res = Integer.compare(dia, o.getDia());
		}

		return res;
	}

	@Override
	public String toString() {
		return dia + "/" + mes;
	}
}
