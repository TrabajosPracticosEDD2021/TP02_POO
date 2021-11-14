package d_logisticaWebCompras;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Movimiento implements Comparable<Movimiento>{
	private int numeroMovimiento;
	private LocalDate fecha;
	private MovimientoTipo tipo;
	private Persona destinatario;
	private List<MovimientoDetalle> detalle;

	public Movimiento(int numeroMovimiento, LocalDate fecha, MovimientoTipo tipo,
			Persona destinatario, List<MovimientoDetalle> detalle) {
		this.numeroMovimiento = numeroMovimiento;
		this.fecha = fecha;
		this.tipo = tipo;
		this.destinatario = destinatario;
		this.detalle = detalle;
	}

	protected int getNumeroMovimiento() {
		return numeroMovimiento;
	}

	protected void setNumeroMovimiento(int numeroMovimiento) {
		this.numeroMovimiento = numeroMovimiento;
	}

	protected LocalDate getFecha() {
		return fecha;
	}

	protected void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	protected MovimientoTipo getTipo() {
		return tipo;
	}

	protected void setTipo(MovimientoTipo tipo) {
		this.tipo = tipo;
	}

	protected Persona getDestinatario() {
		return destinatario;
	}

	protected void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	protected List<MovimientoDetalle> getDetalle() {
		return detalle;
	}

	protected void setDetalle(List<MovimientoDetalle> detalle) {
		this.detalle = detalle;
	}
	
	@Override
	public int compareTo(Movimiento o) {
		return this.fecha.compareTo(o.getFecha());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(destinatario, fecha, numeroMovimiento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movimiento other = (Movimiento) obj;
		return Objects.equals(destinatario, other.destinatario)
				&& Objects.equals(fecha, other.fecha) && numeroMovimiento == other.numeroMovimiento;
	}

	@Override
	public String toString() {
		String strDetalles = "";
		
		for (MovimientoDetalle md : detalle) {
			strDetalles += "\n" + md ;
		}
		
		return "Movimiento [numeroMovimiento=" + numeroMovimiento + ", fecha=" + fecha + ", tipo="
				+ tipo + ", destinatario=" + destinatario + ", detalle=" + strDetalles + "]";
	}

	
}
