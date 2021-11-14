package c_bancoLitoral;

import java.util.Comparator;

public class CreditoTotDevolverComparator implements Comparator<Credito>{

	@Override
	public int compare(Credito o1, Credito o2) {
		return o1.getTotalDevolver().compareTo(o2.getTotalDevolver());
	}

}
