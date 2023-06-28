package clubMaratonTipoParcialTDD;

public class Corredor extends Deportista implements ICorredor {

	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombreDeSocio,Integer distanciaPreferida) {
		super(numeroDeSocio, nombreDeSocio);
		this.distanciaPreferida=distanciaPreferida;
		this.cantidadDeKilometrosEntrenados=0;
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}


	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
        this.cantidadDeKilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return cantidadDeKilometrosEntrenados;
	}

}
