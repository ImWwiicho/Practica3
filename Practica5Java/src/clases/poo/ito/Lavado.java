package clases.poo.ito;
import java.time.LocalDate;

public class Lavado extends Maquina {

	private int capacidadLit = 0;
	private float tiempoProm = 0F;

	
	public Lavado() {
		super();
	}
	
	public Lavado(String descripcion, LocalDate fechaAdd, int costo, float tiempoProm) {
		super(descripcion, fechaAdd, costo);
		this.tiempoProm = tiempoProm;
	}

	//============================================================
	public float costoLavado() {
		// Start of user code for method costoLavado
		float costoLavado = 0F;
		float botellasXMin = 60/this.tiempoProm;
		costoLavado = (0.005F*getCosto())/botellasXMin;
		return costoLavado;
		// End of user code
	}

	//============================================================
	public double getCapacidadLit() {
		return this.capacidadLit;
	}

	//============================================================
	public void setCapacidadLit(int newCapacidadLit) {
		this.capacidadLit = newCapacidadLit;
	}

	//============================================================
	public float getTiempoProm() {
		return this.tiempoProm;
	}

	//============================================================
	public void setTiempoProm(float newTiempoProm) {
		this.tiempoProm = newTiempoProm;
	}

	@Override
	public String toString() {
		return "Maquina de lavado [Descripcion: "+ getDescripcion() + ", Fecha Adquisicion: " + getFechaAdd()  
		+  ", Costo: "+ getCosto() +", Tiempo promedio de lavado: " + tiempoProm + " segundos]";
	}

}
