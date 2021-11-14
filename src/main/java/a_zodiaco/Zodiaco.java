package a_zodiaco;

import java.util.ArrayList;
import java.util.List;

public class Zodiaco {
	private List<Signo> signos;

	public Zodiaco() {
		signos = new ArrayList<Signo>();
		this.setSignos();
	}

	private void setSignos() {
		signos.add(new Signo(new Fecha(21, 3), new Fecha(20, 4), "Aries"));
		signos.add(new Signo(new Fecha(21, 4), new Fecha(21, 5), "Tauro"));
		signos.add(new Signo(new Fecha(22, 5), new Fecha(21, 6), "Geminis"));
		signos.add(new Signo(new Fecha(22, 6), new Fecha(23, 7), "Cancer"));
		signos.add(new Signo(new Fecha(24, 7), new Fecha(23, 8), "Leo"));
		signos.add(new Signo(new Fecha(24, 8), new Fecha(23, 9), "Virgo"));
		signos.add(new Signo(new Fecha(24, 9), new Fecha(23, 10), "Libra"));
		signos.add(new Signo(new Fecha(24, 10), new Fecha(22, 11), "Escorpio"));
		signos.add(new Signo(new Fecha(23, 11), new Fecha(21, 12), "Sagitario"));
		signos.add(new Signo(new Fecha(22, 12), new Fecha(20, 1), "Capricornio"));
		signos.add(new Signo(new Fecha(21, 1), new Fecha(19, 2), "Acuario"));
		signos.add(new Signo(new Fecha(20, 2), new Fecha(20, 3), "Piscis"));
	}

	public List<Signo> getSignos() {
		return signos;
	}
}
