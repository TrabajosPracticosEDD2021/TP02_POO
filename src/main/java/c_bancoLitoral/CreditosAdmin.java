package c_bancoLitoral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CreditosAdmin extends CreditosAdminAbstract {

	/**
	 * Devuelve todos los créditos otorgados a los clientes cuyo tipo es pasado por
	 * parámetro
	 * 
	 * @param tipo
	 * @return
	 */
	@Override
	public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
		List<Credito> resultado = new ArrayList<Credito>();

		for (Credito credito : creditosList) {
			if (credito.getCliente().getTipo().equals(tipo)) {
				resultado.add(credito);
			}
		}
		return resultado;
	}

	/**
	 * Devuelve todos los créditos otorgados del tipo y sucursal especificados.
	 * 
	 * @param tipo
	 * @param sucursal
	 * @return
	 */
	@Override
	public List<Credito> creditosPorCreditoTipoySucursal(CreditoTipo tipo, Sucursal sucursal) {
		List<Credito> resultado = new ArrayList<Credito>();

		for (Credito credito : creditosList) {
			if (credito.getTipo().equals(tipo) && credito.getSucursal().equals(sucursal)) {
				resultado.add(credito);
			}
		}

		return resultado;
	}

	/**
	 * Devuelve los créditos cuyo monto es inferior a monto.
	 * 
	 * @param monto
	 * @return
	 */
	// SUPUSE QUE ERA MONTO ACORDADO DEL CREDITO, NO MONTO A DEVOLVER
	@Override
	public List<Credito> creditosInferioresA(double monto) {
		List<Credito> resultado = new ArrayList<Credito>();
		double montoAcordado = 0;

		for (Credito credito : creditosList) {
			montoAcordado = credito.getMontoAcordado().doubleValue();
			if (montoAcordado < monto) {
				resultado.add(credito);
			}
		}

		return resultado;
	}

	@Override
	public List<Credito> creditosSuperioresA(double monto) {
		List<Credito> resultado = new ArrayList<Credito>();
		double montoAcordado = 0;

		for (Credito credito : creditosList) {
			montoAcordado = credito.getMontoAcordado().doubleValue();
			if (montoAcordado > monto) {
				resultado.add(credito);
			}
		}

		return resultado;
	}

	/**
	 * Ordena los créditos por el criterio especificado en compareTo()
	 */
	@Override
	public void ordenar() {
		Collections.sort(creditosList);
	}

	/**
	 * Ordena los créditos por el criterio pasado por parámetro.
	 * 
	 * @param comparator
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void ordenar(Comparator comparator) {
		creditosList.sort(comparator);
	}

	/**
	 * Transforma en String todas las instancias de Credito almacenadas en
	 * creditosList
	 * 
	 * @return
	 */

	@Override
	public String toString() {
		String resultado = "";

		for (Credito p : creditosList) {
			resultado += p.toString() + "\n";
		}

		return resultado;
	}

}
