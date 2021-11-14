package b_empresaFloripa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarcacionesAdmin extends MarcacionesAdminAbstract{

	/**
	 * Devuelve todos los empleados de los que se tiene registro de marcación (No
	 * repetir resultados).
	 * 
	 * @return
	 */
	@Override
	public List<Empleado> empleados() {
		List<Empleado> empleadosRegistrados = new ArrayList<Empleado>();
		
		for (Marcacion m : marcacionesList) {
			if (!empleadosRegistrados.contains(m.getEmpleado())) {
				empleadosRegistrados.add(m.getEmpleado());
			}
		}
		return empleadosRegistrados;
	}

	/**
	 * Devuelve todas las marcaciones de un empleado.
	 * 
	 * @param empleado
	 * @return
	 */
	@Override
	public List<Marcacion> filtroPorEmpleado(Empleado empleado) {
		List<Marcacion> marcacionesEmpleado = new ArrayList<Marcacion>();
		
		for (Marcacion marcacion : marcacionesList) {
			if (marcacion.getEmpleado().equals(empleado)) {
				marcacionesEmpleado.add(marcacion);
			}
		}
		return marcacionesEmpleado;
	}

	/**
	 * Devuelve todas las marcaciones del tipo especificado por parámetro.
	 * 
	 * @param tipo
	 * @return
	 */
	@Override
	public List<Marcacion> filtroPorTipo(MarcacionTipo tipo) {
		List<Marcacion> res = new ArrayList<Marcacion>();
		
		for (Marcacion marcacion : marcacionesList) {
			if (marcacion.getTipo().equals(tipo)) {
				res.add(marcacion);
			}
		}
		
		return res;
	}

	/**
	 * Devuelve las marcaciones realizadas fuera del horario de ingreso.
	 * 
	 * @return
	 */
	@Override
	public List<Marcacion> llegaronTarde() {
		List<Marcacion> res = new ArrayList<Marcacion>();
		
		for (Marcacion marcacion : marcacionesList) {
			if (marcacion.getTipo().equals(MarcacionTipo.ENTRADA)
				&& marcacion.getFechaHora().isAfter(
						marcacion.getEmpleado().getOficina().getHoraEntrada())) {
				res.add(marcacion);
			}
		}
		
		return res;
	}

	/**
	 * Ordena las marcaciones por el criterio especificado en compareTo()
	 */
	@Override
	public void ordenar() {
		Collections.sort(this.marcacionesList);
		
	}

	/**
	 * Ordena las marcaciones por el criterio pasado por parámetro.
	 * 
	 * @param comparator
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void ordenar(Comparator comparator) {
		marcacionesList.sort(comparator);
	}

	@Override
	public String toString() {
		String str = "";
				
		for (Marcacion m : marcacionesList) {
			str += m.toString() + "\n";
		}
				
		return str;
	}

}
