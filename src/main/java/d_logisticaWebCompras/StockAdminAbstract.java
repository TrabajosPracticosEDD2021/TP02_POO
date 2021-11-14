package d_logisticaWebCompras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class StockAdminAbstract {
	protected List<Movimiento> movimientosList;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public StockAdminAbstract() {
		this.movimientosList = new ArrayList();
	}

	public void agregar(Movimiento mov) {
		this.movimientosList.add(mov);
	}

	public void ordenar() {
		Collections.sort(movimientosList);
	}

	/** Devuelve todos los movimientos de salida de productos. */
	public abstract List<Movimiento> salidas();

	/** Devuelve todos los movimientos de ingreso de productos. */
	public abstract List<Movimiento> entradas();

	/** Devuelve todos los movimientos de un producto */
	public abstract List<Movimiento> movimientosPorProducto(Producto producto);

	/** Devuelve todos los productos entregados a una persona. */
	public abstract List<Producto> productosPorPersona(Persona persona);

	/** Devuelve el stock de productos actual */
	public abstract List<ProductoCantidad> stock();

	/** Devuelve el stock de productos por tipo */
	public abstract List<ProductoTipoCantidad> stockPorTipo();

	public String toString() {
		String res = "";

		for (Movimiento mov : movimientosList) {
			res += mov.toString() + "\n";
		}

		return res;
	}
}
