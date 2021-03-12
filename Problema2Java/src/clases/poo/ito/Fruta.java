package clases.poo.ito;

import java.util.ArrayList;

public class Fruta {

	private String nombre = "";
	private float extension = 0F;
	private ArrayList<String> tiempoCosecha = new ArrayList<String>();
	private ArrayList<Float>cantCosechaxtiempo=new ArrayList<Float>();
	private float costoPromedio = 0F;
	private float precioVentaProm = 0F;

	
	public Fruta() {
		super();
	}
	
	public Fruta(String nombre, float extension, float costoPromedio, float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
	}

	//=======================================
	public void agregarPeriodo(String periodo, float cantEstimada) {
		this.tiempoCosecha.add(periodo);
		this.cantCosechaxtiempo.add(cantEstimada);
	}

	public boolean eliminarPeriodo(int i) {
		i=i-1;
		boolean eliminarPeriodo = false;
		if(i>=0 && i<=this.tiempoCosecha.size()) {
			this.tiempoCosecha.remove(i);
			this.cantCosechaxtiempo.remove(i);
			eliminarPeriodo=true;
		}
		return eliminarPeriodo;
	}

	//=======================================
	public float costoPeriodo(int i) {
		i=i-1;
		float costoPeriodo = 0F;
		if(i>=0 && i<=this.tiempoCosecha.size())
			costoPeriodo=this.cantCosechaxtiempo.get(i)*this.costoPromedio;
		return costoPeriodo;
	}

	//=======================================
	public float ganancia(int i) {
		i=i-1;
		float ganancia = 0F;
		if(i>=0 && i<=this.tiempoCosecha.size())
			ganancia=this.cantCosechaxtiempo.get(i)*this.precioVentaProm;
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
	public ArrayList<String> getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	//=======================================
	public ArrayList<Float> getCantCosechaxtiempo() {
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
