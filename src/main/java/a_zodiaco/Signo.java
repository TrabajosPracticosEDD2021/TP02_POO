package a_zodiaco;

public class Signo implements Comparable<Signo> {
	private Fecha fechaInicio, fechaFin;
	private String signo;

	public Signo(Fecha fechaInicio, Fecha fechaFin, String signo) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.signo = signo;
	}

	public Fecha getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Fecha fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Fecha getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Fecha fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getSigno() {
		return signo;
	}

	public void setSigno(String signo) {
		this.signo = signo;
	}

	@Override
	public int compareTo(Signo o) {
		int res = fechaInicio.compareTo(o.getFechaInicio());
		return res;
	}

	@Override
	public String toString() {
		return signo + " (" + fechaInicio + " al " + fechaFin + ")";
	}
}
