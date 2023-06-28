package clubMaratonTipoParcialTDD;

import java.util.Comparator;

public class OrdenarPorNroDeSocio implements Comparator<Deportista> {

	@Override
	public int compare(Deportista o1, Deportista o2) {
		return o1.getNumeroDeSocio().compareTo(o2.getNumeroDeSocio());
	}

}
