package clases.poo.ito;
import java.time.LocalDate;

public class Maquina {

	private String descripcion = "";
	private LocalDate fechaAdd = null;
	private float costo = 0F;


	public Maquina() {
		super();
	}
	
	protected Maquina(String descripcion, LocalDate fechaAdd, float costo) {
		super();
		this.descripcion = descripcion;
		this.fechaAdd = fechaAdd;
		this.costo = costo;
	}


	//============================================================
	public String getDescripcion() {
		return this.descripcion;
	}

	//============================================================
	public void setDescripcion(String newDescripcion) {
		this.descripcion = newDescripcion;
	}

	//============================================================
	public LocalDate getFechaAdd() {
		return this.fechaAdd;
	}

	//============================================================
	public void setFechaAdd(LocalDate newFechaAdd) {
		this.fechaAdd = newFechaAdd;
	}

	//============================================================
	public float getCosto() {
		return this.costo;
	}

	//============================================================
	public void setCosto(float newCosto) {
		this.costo = newCosto;
	}

}
