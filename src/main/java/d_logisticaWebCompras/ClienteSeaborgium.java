package d_logisticaWebCompras;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteSeaborgium {
	public static void main(String[] args) {

		Persona p1 = new Persona("Kling", "Alejandro");
		Persona p2 = new Persona("Lopez", "Sebastian");
		Persona p3 = new Persona("Alvarez", "Daniel");
		Persona p4 = new Persona("Peña", "Kevin");
		Persona c1 = new Persona("Maldonado", "Aldana");
		Persona c2 = new Persona("Lauren", "Jorge");
		Persona c3 = new Persona("Morel", "Rodrigo");

		Producto celJ7 = new Producto(new ProductoTipo("Celular"), new ProductoMarca("Samsung"),
				"J7");
		Producto celIphone = new Producto(new ProductoTipo("Celular"), new ProductoMarca("Iphone"),
				"11X");
		Producto celA31 = new Producto(new ProductoTipo("Celular"), new ProductoMarca("Samsung"),
				"A31");
		Producto notHP = new Producto(new ProductoTipo("PC"), new ProductoMarca("HP"), "250G7");
		Producto notLenovo = new Producto(new ProductoTipo("PC"), new ProductoMarca("Lenovo"),
				"Presario");
		Producto tabletSam = new Producto(new ProductoTipo("Tablet"), new ProductoMarca("Samsung"),
				"Tab A7");
		Producto auriRedDragon = new Producto(new ProductoTipo("Auriculares"),
				new ProductoMarca("RedDragon"), "Generico");
		Producto templadoLg = new Producto(new ProductoTipo("Vidrio Templado"),
				new ProductoMarca("LG"), "K22");
		Producto cargadorChino = new Producto(new ProductoTipo("Cargador"), new ProductoMarca("Chino"),
				"Generico");
		Producto batA10 = new Producto(new ProductoTipo("Bateria"),
				new ProductoMarca("Samsung"), "A10");
		Producto batA20 = new Producto(new ProductoTipo("Bateria"),
				new ProductoMarca("Samsung"), "A20");
		Producto celLg = new Producto(new ProductoTipo("Celular"), new ProductoMarca("LG"),
				"K22");
		Producto resmaA4 = new Producto(new ProductoTipo("Resma"), new ProductoMarca("Boreal"),
				"(500 Hojas) A4");
		Producto resmaA7 = new Producto(new ProductoTipo("Resma"), new ProductoMarca("ART-JET"),
				"(100 Hojas) A7");
		Producto memSD = new Producto(new ProductoTipo("Memoria"),
				new ProductoMarca("Kingston"), "16GB Extreme PRO");

		List<MovimientoDetalle> detCnot = new ArrayList<MovimientoDetalle>(); // C Not
		detCnot.add(new MovimientoDetalle(notHP, 2));
		detCnot.add(new MovimientoDetalle(notLenovo, 2));
		List<MovimientoDetalle> detCcelular = new ArrayList<MovimientoDetalle>(); // C Celulares
		detCcelular.add(new MovimientoDetalle(celJ7, 3));
		detCcelular.add(new MovimientoDetalle(celIphone, 2));
		detCcelular.add(new MovimientoDetalle(celA31, 3));
		detCcelular.add(new MovimientoDetalle(celLg, 3));
		detCcelular.add(new MovimientoDetalle(tabletSam, 3));
		List<MovimientoDetalle> detCcargador = new ArrayList<MovimientoDetalle>();// C car, bat,auri
		detCcargador.add(new MovimientoDetalle(batA10, 3));
		detCcargador.add(new MovimientoDetalle(batA20, 3));
		detCcargador.add(new MovimientoDetalle(auriRedDragon, 2));
		detCcargador.add(new MovimientoDetalle(cargadorChino, 5));
		detCcargador.add(new MovimientoDetalle(memSD, 5));
		List<MovimientoDetalle> detCresma = new ArrayList<MovimientoDetalle>(); // C Resma
		detCresma.add(new MovimientoDetalle(resmaA4, 20));
		detCresma.add(new MovimientoDetalle(resmaA7, 20));
		
		List<MovimientoDetalle> v1 = new ArrayList<MovimientoDetalle>(); // V celu y temp
		v1.add(new MovimientoDetalle(templadoLg, 2));
		v1.add(new MovimientoDetalle(celLg, 1));
		List<MovimientoDetalle> v2 = new ArrayList<MovimientoDetalle>(); // V resma y mem
		v2.add(new MovimientoDetalle(memSD, 1));
		v2.add(new MovimientoDetalle(resmaA7, 2));
		List<MovimientoDetalle> v3 = new ArrayList<MovimientoDetalle>(); // V de not
		v3.add(new MovimientoDetalle(notHP, 1));
		List<MovimientoDetalle> v4 = new ArrayList<MovimientoDetalle>(); // V de not
		v4.add(new MovimientoDetalle(notLenovo, 1));
		List<MovimientoDetalle> v5 = new ArrayList<MovimientoDetalle>(); // V tablet y auri
		v5.add(new MovimientoDetalle(tabletSam, 1));
		v5.add(new MovimientoDetalle(auriRedDragon, 1));
//		List<MovimientoDetalle> detalles9 = new ArrayList<MovimientoDetalle>(); // C Resma
//		detalles9.add(new MovimientoDetalle(producto14, 5));

		// Movimiento de ENTRADA: Adquisicion de nuevos productos
		// Movimiento de SALIDA: Venta de producto

		Movimiento compNot = new Movimiento(13, LocalDate.of(2021, 9, 2), MovimientoTipo.ENTRADA,
				p1, detCnot);
		Movimiento compCelu = new Movimiento(14, LocalDate.of(2021, 9, 2), MovimientoTipo.ENTRADA,
				p2, detCcelular);
		Movimiento comAccesorios = new Movimiento(15, LocalDate.of(2021, 9, 2),
				MovimientoTipo.ENTRADA, p3, detCcargador);
		Movimiento comResma = new Movimiento(16, LocalDate.of(2021, 9, 2), MovimientoTipo.ENTRADA,
				p4, detCresma);

		Movimiento vent1 = new Movimiento(23, LocalDate.of(2021, 9, 6), MovimientoTipo.SALIDA, c1,
				v1);
		Movimiento vent2 = new Movimiento(20, LocalDate.of(2021, 9, 9), MovimientoTipo.SALIDA, c2,
				v3);
		Movimiento vent3 = new Movimiento(24, LocalDate.of(2021, 9, 7), MovimientoTipo.SALIDA, c1,
				v2);
		Movimiento vent4 = new Movimiento(21, LocalDate.of(2021, 9, 8), MovimientoTipo.SALIDA, c3,
				v4);
		Movimiento vent5 = new Movimiento(22, LocalDate.of(2021, 9, 11), MovimientoTipo.SALIDA, c3,
				v5);

		StockAdmin adminStock = new StockAdmin();
		adminStock.agregar(compNot);
		adminStock.agregar(compCelu);
		adminStock.agregar(comAccesorios);
		adminStock.agregar(comResma);
		adminStock.agregar(vent1);
		adminStock.agregar(vent2);
		adminStock.agregar(vent3);
		adminStock.agregar(vent4);
		adminStock.agregar(vent5);

		System.out.println("\nTODOS LOS MOVIMIENTOS: ");
		System.out.println("======================");
		System.out.println(adminStock);

		System.out.println("\nMOVIMIENTOS ORDENADOS POR FECHA: ");
		System.out.println("================================");
		adminStock.ordenar();
		System.out.println(adminStock);

		System.out.println("\nTODOS LOS MOVIMIENTOS TIPO SALIDA: ");
		System.out.println("==================================");
		adminStock.salidas().forEach(System.out::println);

		System.out.println("\nTODOS LOS MOVIMIENTOS TIPO ENTRADA: ");
		System.out.println("===================================");
		adminStock.entradas().forEach(System.out::println);

		System.out.println("\nTODOS LOS MOVIMIENTOS DE UN PRODUCTO (Celular LG K22): ");
		System.out.println("=======================================================");
		adminStock.movimientosPorProducto(celLg).forEach(System.out::println);

		// SUPUSE QUE COMO DICE ENTREGADO, SON LOS MOVIMIENTOS TIPO SALIDAS
		System.out.println("\nTODOS LOS PRODUCTOS ENTREGADOS A UNA PERSONA: ");
		System.out.println("===============================================");
		adminStock.productosPorPersona(p2).forEach(System.out::println);

		System.out.println("\nSTOCK DE PRODUCTOS: ");
		System.out.println("=====================");
		adminStock.stock().forEach(System.out::println);

		System.out.println("\nSTOCK DE PRODUCTOS POR TIPO: ");
		System.out.println("==============================");
		adminStock.stockPorTipo().forEach(System.out::println);

	}
}
