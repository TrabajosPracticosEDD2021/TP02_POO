package c_bancoLitoral;

import java.math.BigDecimal;
import java.util.Objects;

public class CreditoTipo {
	private int aniosMin, aniosMax;
	private BigDecimal montoMin, montoMax, tasaInteres;
	private String descripcion;
	private ClienteTipoEnum clienteTipo;

	public CreditoTipo(int aniosMin, int aniosMax, BigDecimal montoMin, BigDecimal montoMax,
			BigDecimal tasaInteres, String descripcion, ClienteTipoEnum clienteTipo) {
		this.aniosMin = aniosMin;
		this.aniosMax = aniosMax;
		this.montoMin = montoMin;
		this.montoMax = montoMax;
		this.tasaInteres = tasaInteres;
		this.descripcion = descripcion;
		this.clienteTipo = clienteTipo;
	}

	public int getAniosMin() {
		return aniosMin;
	}

	public void setAniosMin(int aniosMin) {
		this.aniosMin = aniosMin;
	}

	public int getAniosMax() {
		return aniosMax;
	}

	public void setAniosMax(int aniosMax) {
		this.aniosMax = aniosMax;
	}

	public BigDecimal getMontoMin() {
		return montoMin;
	}

	public void setMontoMin(BigDecimal montoMin) {
		this.montoMin = montoMin;
	}

	public BigDecimal getMontoMax() {
		return montoMax;
	}

	public void setMontoMax(BigDecimal montoMax) {
		this.montoMax = montoMax;
	}

	public BigDecimal getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(BigDecimal tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ClienteTipoEnum getClienteTipo() {
		return clienteTipo;
	}

	public void setClienteTipo(ClienteTipoEnum clienteTipo) {
		this.clienteTipo = clienteTipo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aniosMax, aniosMin, clienteTipo, descripcion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreditoTipo other = (CreditoTipo) obj;
		return aniosMax == other.aniosMax && aniosMin == other.aniosMin
				&& clienteTipo == other.clienteTipo
				&& Objects.equals(descripcion, other.descripcion);
	}

	@Override
	public String toString() {
		return "CreditoTipo [" + descripcion + "]";
	}
}
