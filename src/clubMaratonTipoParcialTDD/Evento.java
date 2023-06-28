package clubMaratonTipoParcialTDD;

import java.util.HashMap;
import java.util.Map;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo) {
		this.tipo = tipo;
		this.numeroDeInscripcion=1;
		this.participantes=new HashMap<>();
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	public Integer ingresarParticipantes(Deportista aParticipar)throws NoEstaPreparado {
		if(estaPreparado(aParticipar)) {
		   participantes.put(numeroDeInscripcion, aParticipar);
		 }
		return numeroDeInscripcion ++;
	}
	
	public Boolean estaPreparado(Deportista aParticipar)throws NoEstaPreparado{
		switch (this.tipo) {
		case CARRERA_5K:
		case CARRERA_10K:
		case CARRERA_21K:
		case CARRERA_42K:
			 if(!(aParticipar instanceof ICorredor)) {
				 throw new NoEstaPreparado();
			 }
			 break;		 
		case DUATLON:
			 if(!(aParticipar instanceof ICorredor) || !(aParticipar instanceof ICiclista)){
				 throw new NoEstaPreparado();
			 }
			 break;
		case CARRERA_NATACION_EN_PICINA:
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			 if(!(aParticipar instanceof INadador)){
				 throw new NoEstaPreparado();
			 }
			 break;
		case TRIATLON_SHORT:
		case TRIATLON_OLIMPICO:
		case TRIATLON_MEDIO:
		case TRIATLON_IRONMAN:
			 if(!(aParticipar instanceof ICorredor) || !(aParticipar instanceof ICiclista) || !(aParticipar instanceof INadador)){
				 throw new NoEstaPreparado();
			 }
			 break;
		 }
	  return true;
	}
	
}
