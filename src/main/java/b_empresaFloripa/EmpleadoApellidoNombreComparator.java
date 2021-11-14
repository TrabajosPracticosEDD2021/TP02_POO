package b_empresaFloripa;

import java.util.Comparator;

public class EmpleadoApellidoNombreComparator implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int res = o1.getApellido().compareTo(o2.getApellido());
		
		if (res == 0) {
			res = o1.getNombre().compareTo(o2.getNombre());
		}
		
		return res;
	}
	
}
