package clubMaratonTipoParcialTDD;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre=nombre;
		this.socios=new HashSet<>();
		this.competencias=new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}

	public void agregarDeportista(Deportista nuevo) {
		this.socios.add(nuevo);
		
	}

	public Integer getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombreDelEvento) {
		this.competencias.put(nombreDelEvento, new Evento(tipo));
	}

	public Integer inscribirEnEvento(String nombreDelEvento, Deportista deportista)throws NoEstaPreparado {
		Evento buscado=competencias.get(nombreDelEvento);
		
		return buscado.ingresarParticipantes(deportista);
	}
	
	public TreeSet<Deportista> obtenerDeportistasOrdenadosPorNroDeSocio(){
		TreeSet<Deportista>ordenPorNroDeSocio=new TreeSet<>(new OrdenarPorNroDeSocio());
		ordenPorNroDeSocio.addAll(socios);
		return ordenPorNroDeSocio;
	}
	
}
