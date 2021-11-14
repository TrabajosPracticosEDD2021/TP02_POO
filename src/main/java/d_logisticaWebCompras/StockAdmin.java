package d_logisticaWebCompras;

import java.util.ArrayList;
import java.util.List;

public class StockAdmin extends StockAdminAbstract {

	/** Devuelve todos los movimientos de salida de productos. */
	@Override
	public List<Movimiento> salidas() {
		List<Movimiento> resultado = new ArrayList<Movimiento>();

		for (Movimiento movimiento : movimientosList) {
			if (movimiento.getTipo().equals(MovimientoTipo.SALIDA)) {
				resultado.add(movimiento);
			}
		}

		return resultado;
	}

	/** Devuelve todos los movimientos de ingreso de productos. */
	@Override
	public List<Movimiento> entradas() {
		List<Movimiento> resultado = new ArrayList<Movimiento>();

		for (Movimiento movimiento : movimientosList) {
			if (movimiento.getTipo().equals(MovimientoTipo.ENTRADA)) {
				resultado.add(movimiento);
			}
		}

		return resultado;
	}

	/** Devuelve todos los movimientos de un producto */
	@Override
	public List<Movimiento> movimientosPorProducto(Producto producto) {
		List<Movimiento> resultado = new ArrayList<Movimiento>();

		for (Movimiento movimiento : movimientosList) {
			for (MovimientoDetalle detalle : movimiento.getDetalle()) {
				if (detalle.getProducto().equals(producto)) {
					resultado.add(movimiento);
				}
			}
		}

		return resultado;
	}

	/** Devuelve todos los productos entregados a una persona. */
	// SUPUSE QUE COMO DICE ENTREGADO, SON LOS MOVIMIENTOS TIPO SALIDAS
	@Override
	public List<Producto> productosPorPersona(Persona persona) {
		List<Producto> resultado = new ArrayList<Producto>();

		for (Movimiento movimiento : movimientosList) {
			if (movimiento.getDestinatario().equals(persona)
					&& movimiento.getTipo().equals(MovimientoTipo.SALIDA)) {
				for (MovimientoDetalle detalle : movimiento.getDetalle()) {
					resultado.add(detalle.getProducto());
				}
			}
		}

		return resultado;
	}

	/** Devuelve el stock de productos actual */
	@Override
	public List<ProductoCantidad> stock() {
		List<ProductoCantidad> resultado = new ArrayList<ProductoCantidad>();
		boolean contains = false;

		for (Movimiento movimiento : movimientosList) {
			if (movimiento.getTipo().equals(MovimientoTipo.ENTRADA)) {
				contains = false;
				for (MovimientoDetalle detalle : movimiento.getDetalle()) {
					for (ProductoCantidad productoCantidad : resultado) {
						if (productoCantidad.getProducto().equals(detalle.getProducto())) {
							productoCantidad.setCantidad(
									productoCantidad.getCantidad() + detalle.getCantidad());
							contains = true;
						}
					}
					if (!contains) {
						resultado.add(
								new ProductoCantidad(detalle.getCantidad(), detalle.getProducto()));
					}
				}
			}
		}
		return resultado;
	}

	/** Devuelve el stock de productos por tipo */
	@Override
	public List<ProductoTipoCantidad> stockPorTipo() {
		List<ProductoTipoCantidad> stockTipo = new ArrayList<ProductoTipoCantidad>();
		boolean contains = false; // Bandera para ver si ya existe el ProductoTipoCantidad

		for (Movimiento movimiento : movimientosList) { // Recorre todos los movimientos
			if (movimiento.getTipo().equals(MovimientoTipo.ENTRADA)) { // Control que sea entrada
				contains = false;
				for (MovimientoDetalle detalle : movimiento.getDetalle()) { // Recorre detalles
					for (ProductoTipoCantidad proTipCant : stockTipo) {

						if (proTipCant.getTipo().equals(detalle.getProducto().getTipo())) {
							proTipCant
									.setCantidad(proTipCant.getCantidad() + detalle.getCantidad());
							contains = true;
						}
					}
					if (!contains) {
						stockTipo.add(new ProductoTipoCantidad(detalle.getCantidad(),
								detalle.getProducto().getTipo()));
					}
				}
			}
		}

		return stockTipo;
	}

}
