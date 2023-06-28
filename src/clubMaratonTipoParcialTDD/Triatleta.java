package clubMaratonTipoParcialTDD;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador {

	private String distanciaPreferida;
	private TipoDeBicicleta tipo;
	private String estiloPreferido;
	private Integer cantidadDeKilometrosEntrenados;
	public Triatleta(Integer numeroDeSocio, String nombreDeSocio,String distanciaPreferida,TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombreDeSocio);
		this.distanciaPreferida=distanciaPreferida;
		this.tipo=tipo;
		this.estiloPreferido="";
		this.cantidadDeKilometrosEntrenados=0;
		
	}

	
	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}


	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public String getEstiloPreferido() {
		// TODO Auto-generated method stub
		return estiloPreferido;
	}

	@Override
	public void setEstiloPreferido(String estiloPreferido) {
		// TODO Auto-generated method stub
		this.estiloPreferido=estiloPreferido;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		cantidadDeKilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return cantidadDeKilometrosEntrenados;
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
