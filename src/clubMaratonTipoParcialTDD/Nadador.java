package clubMaratonTipoParcialTDD;

public class Nadador extends Deportista implements INadador {

	private String estiloPreferido;
	
	public Nadador(Integer numeroDeSocio, String nombreDeSocio,String estiloPreferido) {
		super(numeroDeSocio, nombreDeSocio);
		this.estiloPreferido=estiloPreferido;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estiloPreferido;
	}
	
	@Override
	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
		
	}
	

	
}
