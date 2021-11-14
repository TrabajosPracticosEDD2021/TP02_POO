package c_bancoLitoral;

import java.util.Comparator;

public class CreditoClienteComparator implements Comparator<Credito>{

	@Override
	public int compare(Credito o1, Credito o2) {
		return o1.getCliente().compareTo(o2.getCliente());
	}
	
}
