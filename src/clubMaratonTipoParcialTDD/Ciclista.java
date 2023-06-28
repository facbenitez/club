package clubMaratonTipoParcialTDD;

public class Ciclista extends Deportista implements ICiclista {

	private TipoDeBicicleta tipo;
	
	public Ciclista(Integer numeroDeSocio, String nombreDeSocio,TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombreDeSocio);
		this.tipo=tipo;
		
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public void setTipoDeBicicleta(TipoDeBicicleta tipo) {
		// TODO Auto-generated method stub
		this.tipo=tipo;
	}


	
	

}
