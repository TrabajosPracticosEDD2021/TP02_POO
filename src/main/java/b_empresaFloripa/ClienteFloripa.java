package b_empresaFloripa;

import java.time.LocalTime;
import java.util.Comparator;

public class ClienteFloripa {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Oficina ofi8 = new Oficina("Oficina 8", LocalTime.of(8, 0), LocalTime.of(15, 30));
		Oficina ofi6 = new Oficina("Oficina 6", LocalTime.of(6, 30), LocalTime.of(15, 30));
		Oficina ofi7 = new Oficina("Oficina 7", LocalTime.of(7, 30), LocalTime.of(20, 30));
		Oficina ofi9 = new Oficina("Oficina 9", LocalTime.of(9, 0), LocalTime.of(15, 15));
		Oficina ofi13 = new Oficina("Oficina 13", LocalTime.of(13, 0), LocalTime.of(14, 30));
		
		Empleado pedro = new Empleado(1300, "Pedro", "Lopez", "41629218", ofi8);
		Empleado karina = new Empleado(13221, "Karina", "Mendez", "14442222", ofi6);
		Empleado kevin = new Empleado(4213, "Kevin", "Benitez", "42321111",	ofi7);
		Empleado alvaro = new Empleado(5232, "Alvaro", "Mendez", "42311112", ofi9);
		Empleado pablo = new Empleado(1234, "Pablo", "Alvarez", "31212222", ofi13);
		
		Marcacion m1 = new Marcacion(32211, LocalTime.of(12, 13), MarcacionTipo.ENTRADA, pablo);
		Marcacion m2 = new Marcacion(23124, LocalTime.of(6, 0), MarcacionTipo.ENTRADA, karina);
		Marcacion m3 = new Marcacion(41231, LocalTime.of(7, 43), MarcacionTipo.ENTRADA, kevin);
		Marcacion m4 = new Marcacion(324231, LocalTime.of(9, 33), MarcacionTipo.ENTRADA, alvaro);
		Marcacion m6 = new Marcacion(3214, LocalTime.of(6, 23), MarcacionTipo.ENTRADA, kevin);
		Marcacion m7 = new Marcacion(13223, LocalTime.of(12, 13), MarcacionTipo.ENTRADA, pablo);
		Marcacion m8 = new Marcacion(55332, LocalTime.of(5, 53), MarcacionTipo.ENTRADA, karina);
		Marcacion m9 = new Marcacion(34221, LocalTime.of(8, 53), MarcacionTipo.ENTRADA, alvaro);
		Marcacion m10 = new Marcacion(42132, LocalTime.of(12, 13), MarcacionTipo.SALIDA, alvaro);
		Marcacion m5 = new Marcacion(23422, LocalTime.of(21, 13), MarcacionTipo.SALIDA, alvaro);
		Marcacion m11 = new Marcacion(342351, LocalTime.of(5, 13), MarcacionTipo.ENTRADA, alvaro);
		Marcacion m12 = new Marcacion(314123, LocalTime.of(12, 12), MarcacionTipo.ENTRADA, pablo);
		Marcacion m13 = new Marcacion(2314213, LocalTime.of(8, 0), MarcacionTipo.ENTRADA, pedro);
		Marcacion m14 = new Marcacion(234233, LocalTime.of(7, 13), MarcacionTipo.ENTRADA, karina);
		Marcacion m15 = new Marcacion(42353, LocalTime.of(12, 13), MarcacionTipo.ENTRADA, pablo);
		
		MarcacionesAdmin marcacionesAdm = new MarcacionesAdmin();
		marcacionesAdm.add(m1);
		marcacionesAdm.add(m2);
		marcacionesAdm.add(m3);
		marcacionesAdm.add(m4);
		marcacionesAdm.add(m5);
		marcacionesAdm.add(m6);
		marcacionesAdm.add(m7);
		marcacionesAdm.add(m8);
		marcacionesAdm.add(m9);
		marcacionesAdm.add(m10);
		marcacionesAdm.add(m11);
		marcacionesAdm.add(m12);
		marcacionesAdm.add(m13);
		marcacionesAdm.add(m14);
		marcacionesAdm.add(m15);
		
		System.out.println("TODOS: ");
		System.out.println("======");
		for (Marcacion m : marcacionesAdm.marcacionesList) {
			System.out.println(m);
		}
		
		System.out.println("\nTODOS LOS EMPLEADOS REGISTRADOS: ");
		System.out.println("================================");
		for (Empleado em : marcacionesAdm.empleados()) {
			System.out.println(em);
		}
		
		System.out.println("\nTODAS LAS MARCACIONES DEL EMPLEADO PASADO POR PARAM: ");
		System.out.println("======================================================");
		for (Marcacion m : marcacionesAdm.filtroPorEmpleado(pedro)) {
			System.out.println(m);
		}

		System.out.println("\nFILTRADO POR TIPO PASADO POR PARAM: ");
		System.out.println("====================================");
		for (Marcacion m : marcacionesAdm.filtroPorTipo(MarcacionTipo.SALIDA)) {
			System.out.println(m);
		}
		
		System.out.println("\nFILTRADO LOS QUE LLEGARON TARDE: "); //kevin, keri
		System.out.println("=================================================");
		System.out.println(marcacionesAdm.llegaronTarde());
		
		System.out.println("\nORDENANDO POR ORDEN NATURAL (fechahora): ");
		System.out.println("==========================================");
		marcacionesAdm.ordenar();
		for (Marcacion m : marcacionesAdm.marcacionesList) {
			System.out.println(m);
		}
		
		System.out.println("\nORDENANDO POR ORDEN NUMERO DE MARCACION: ");
		System.out.println("==========================================");
		marcacionesAdm.ordenar(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Marcacion other1 = (Marcacion) o1;
				Marcacion other2 = (Marcacion) o2;
				return Integer.compare(other1.getNumero(), other2.getNumero());
			}
		});
		for (Marcacion m : marcacionesAdm.marcacionesList) {
			System.out.println(m);
		}
	}
}
