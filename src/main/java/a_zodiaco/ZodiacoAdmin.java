package a_zodiaco;

import java.util.List;

public class ZodiacoAdmin {
	public String averiguarSigno(Persona persona) {
		String res = "";
		Zodiaco z = new Zodiaco();
		Fecha fe = persona.getFechaNacimiento();
		List<Signo> signos = z.getSignos();
		for (Signo signo : signos) {
			if (fe.compareTo(signo.getFechaInicio()) >= 0 
					&& fe.compareTo(signo.getFechaFin()) <= 0) {
				res = signo.toString();
			} 
		}
		return res;
	}
}
