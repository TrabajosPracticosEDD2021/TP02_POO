package c_bancoLitoral;

import java.math.BigDecimal;
import java.util.Objects;

public class Credito implements Comparable<Credito> {
	private int numero, plazoAnios;
	private CreditoTipo tipo;
	private Cliente cliente;
	private Sucursal sucursal;
	private BigDecimal montoAcordado;
	private final BigDecimal TOTAL_DE_DEVOLVER;

	public Credito(int numero, int plazoAnios, CreditoTipo tipo, Cliente cliente, Sucursal sucursal,
			BigDecimal montoAcordado) throws Exception {
		if (verificarCondicionesNecesarias(cliente, tipo, montoAcordado, plazoAnios)) {
			this.numero = numero;
			this.plazoAnios = plazoAnios;
			this.tipo = tipo;
			this.cliente = cliente;
			this.sucursal = sucursal;
			this.montoAcordado = montoAcordado;
			TOTAL_DE_DEVOLVER = this.montoAcordado.multiply(this.tipo.getTasaInteres());
		} else {
			throw new Exception("CONDICION NO PERMITIDA");
		}
	}

	/**
	 * 1) El tipo de credito debe coincidir con el tipo de persona que lo pide. 2)El
	 * monto acordado debe estar entre el minimo y el maximo segun el tipo de
	 * credito. 3) El plazo en anios debe estar entre el minimo y el maximo de anios
	 * segun el tipo de credito.
	 *
	 */
	private boolean verificarCondicionesNecesarias(Cliente cliente, CreditoTipo creditoTipo,
			BigDecimal montoAcordado, int plazoAnios) {
		boolean creditoTipoCoincideCliente = (cliente.getTipo()
				.equals(creditoTipo.getClienteTipo()));
		boolean montoAcordadoCorrecto = ((montoAcordado.compareTo(creditoTipo.getMontoMax()) <= 0
				&& montoAcordado.compareTo(creditoTipo.getMontoMin()) >= 0));
		boolean plazoAniosCorrecto = ((Integer.compare(plazoAnios, creditoTipo.getAniosMin()) >= 0
				&& Integer.compare(plazoAnios, creditoTipo.getAniosMax()) <= 0));

		return creditoTipoCoincideCliente && montoAcordadoCorrecto && plazoAniosCorrecto;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlazoAnios() {
		return plazoAnios;
	}

	public void setPlazoAnios(int plazoAnios) throws Exception {
		if (Integer.compare(plazoAnios, this.tipo.getAniosMin()) >= 0
				&& Integer.compare(plazoAnios, this.tipo.getAniosMax()) <= 0) {
			this.plazoAnios = plazoAnios;
		} else {
			throw new Exception("Anios Fuera de los limites");
		}
	}

	public BigDecimal getMontoAcordado() {
		return montoAcordado;
	}

	public void setMontoAcordado(BigDecimal montoAcordado) throws Exception {
		if (montoAcordado.compareTo(this.tipo.getMontoMax()) <= 0
				&& montoAcordado.compareTo(this.tipo.getMontoMin()) >= 0) {
			this.montoAcordado = montoAcordado;
		} else {
			throw new Exception("Monto Fuera de los limites");
		}
	}

	public BigDecimal getTotalDevolver() {
		return TOTAL_DE_DEVOLVER;
	}

	public CreditoTipo getTipo() {
		return tipo;
	}

	public void setTipo(CreditoTipo tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Credito other = (Credito) obj;
		return Objects.equals(cliente, other.cliente) && numero == other.numero;
	}

	@Override
	public String toString() {
		return "Credito [numero=" + numero + ", plazoAnios=" + plazoAnios + ", montoAcordado="
				+ montoAcordado + ", totalDevolver=" + TOTAL_DE_DEVOLVER + ", tipo=" + tipo
				+ ", cliente=" + cliente + ", sucursal=" + sucursal + "]";
	}

	@Override
	public int compareTo(Credito o) {
		return Integer.compare(this.numero, o.numero);
	}
}
