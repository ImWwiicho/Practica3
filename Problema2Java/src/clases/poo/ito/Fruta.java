package clases.poo.ito;

import java.util.HashSet;

public class Fruta {

	private String nombre = "";
	private float extension = 0F;
	private HashSet<String> tiempoCosecha = new HashSet<String>();
	private HashSet<Float> cantCosechaxtiempo = new HashSet<Float>();
	private float costoPromedio = 0F;
	private float precioVentaProm = 0F;

	public Fruta() {
		super();
	}
	
	public Fruta(String nombre, float extension, HashSet<String> tiempoCosecha, HashSet<Float> cantCosechaxtiempo,
			float costoPromedio, float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxtiempo = cantCosechaxtiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}

	//=======================================
	public void agregarPeriodo(String periodo, float cantEstimada) {
	}

	//=======================================
	public boolean eliminarPeriodo(int i) {
		boolean eliminarPeriodo = false;
		return eliminarPeriodo;
	}

	//=======================================
	public float costoPeriodo(int i) {
		float costoPeriodo = 0F;
		return costoPeriodo;

	}

	//=======================================
	public float ganancia(int i) {	
		float ganancia = 0F;
		return ganancia;
	}

	//=======================================
	public String getNombre() {
		return this.nombre;
	}

	//=======================================
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	//=======================================
	public float getExtension() {
		return this.extension;
	}

	//=======================================
	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	//=======================================
	public HashSet<String> getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	//=======================================
	public HashSet<Float> getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	//=======================================
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	//=======================================
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	//=======================================
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	//=======================================
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", extension=" + extension + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxtiempo=" + cantCosechaxtiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + "]";
	}

}
