package clubMaratonTipoParcialTDD;

public abstract class Deportista {
	private Integer numeroDeSocio;
	private String nombreDeSocio;
	
	public Deportista(Integer numeroDeSocio, String nombreDeSocio) {
		
		this.numeroDeSocio = numeroDeSocio;
		this.nombreDeSocio = nombreDeSocio;
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		this.numeroDeSocio = numeroDeSocio;
	}

	public String getNombreDeSocio() {
		return nombreDeSocio;
	}

	public void setNombreDeSocio(String nombreDeSocio) {
		this.nombreDeSocio = nombreDeSocio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDeSocio == null) ? 0 : numeroDeSocio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Deportista other = (Deportista) obj;
		if (numeroDeSocio == null) {
			if (other.numeroDeSocio != null)
				return false;
		} else if (!numeroDeSocio.equals(other.numeroDeSocio))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Deportista [numeroDeSocio=" + numeroDeSocio + ", nombreDeSocio=" + nombreDeSocio + "]";
	}
		
	
}
