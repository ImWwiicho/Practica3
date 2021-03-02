package clases.poo.ito;

public class Ubicacion {

	private float longitud = 0F;
	private float latitud = 0F;
	private String periodo = "";
	private float distancia = 0F;
	private String medida = "";

	
	public Ubicacion() {
		super();
	}
	
	public Ubicacion(float longitud, float latitud, String periodo, float distancia, String medida) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
		this.periodo = periodo;
		this.distancia = distancia;
		this.medida = medida;
	}

	public float getLongitud() {
		return this.longitud;
	}

	public void setLongitud(float newLongitud) {
		this.longitud = newLongitud;
	}

	public float getLatitud() {
		return this.latitud;
	}

	public void setLatitud(float newLatitud) {
		this.latitud = newLatitud;
	}

	public String getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(String newPeriodo) {
		this.periodo = newPeriodo;
	}

	public float getDistancia() {
		return this.distancia;
	}

	public void setDistancia(float newDistancia) {
		this.distancia = newDistancia;
	}
	
	public String getMedida() {
		return this.medida;
	}

	public void setMedida(String newMedida) {
		this.medida = newMedida;
	}

	@Override
	public String toString() {
		return "Ubicacion [longitud=" + longitud + ", latitud=" + latitud + ", periodo=" + periodo + ", distancia="
				+ distancia + medida + "]";
	}

}
