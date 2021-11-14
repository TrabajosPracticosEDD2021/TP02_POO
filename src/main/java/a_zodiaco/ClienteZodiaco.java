package a_zodiaco;


public class ClienteZodiaco {
	public static void main(String[] args) {
				
		ZodiacoAdmin zAdmin = new ZodiacoAdmin();
		Persona kevin = new Persona("Kevin", new Fecha(29, 01, 1999)); //Acuario
		Persona carmen = new Persona("Carmen", new Fecha(15, 10, 1962)); //Libra
		Persona lucas = new Persona("Lucas", new Fecha(20, 03)); //Piscis
		Persona alan = new Persona("Alan", new Fecha(9, 11)); //Escorpio
		
		
		
		System.out.println(kevin.getNombre() + " -> " + zAdmin.averiguarSigno(kevin));
		System.out.println(carmen.getNombre() + " -> " + zAdmin.averiguarSigno(carmen));
		System.out.println(lucas.getNombre() + " -> " + zAdmin.averiguarSigno(lucas));
		System.out.println(alan.getNombre() + " -> " + zAdmin.averiguarSigno(alan));
		
	}
}
