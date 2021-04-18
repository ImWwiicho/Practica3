package clases.poo.ito;
import java.time.LocalDate;
import java.util.HashSet;

public class LlenadoYEnvasado extends Maquina {

	private float envasesXMin = 0F;
	private HashSet<Integer> listaEnvases = new HashSet<Integer>();
	
	
	public LlenadoYEnvasado() {
		super();
	}
	
	public LlenadoYEnvasado (String descripcion, LocalDate fechaAdd, int costo, float envasesXMin) {
		super(descripcion, fechaAdd, costo);
		this.envasesXMin = envasesXMin;
	}

	//============================================================
	public float costoLLyE() {
		// Start of user code for method costoLLyE
		float costoLLyE = 0F;
		costoLLyE = (0.0025F*getCosto())/this.envasesXMin;
		return costoLLyE;
		// End of user code
	}

	//============================================================
	public float getEnvasesXMin() {
		return this.envasesXMin;
	}

	//============================================================
	public void setEnvasesXMin(float newEnvasesXMin) {
		this.envasesXMin = newEnvasesXMin;
	}

	//============================================================
	public void addListaEnvases(int i){
		this.listaEnvases.add(i);
	}
	
	//============================================================
	public HashSet<Integer> getListaEnvases() {
		return this.listaEnvases;
	}
	
	@Override
	public String toString() {
		return "Maquina de llenado y envasado [Descripcion: "+ getDescripcion() + ", Fecha Adquisicion: " + getFechaAdd()  
		+  ", Costo: "+ getCosto() +", Envases por minuto: " + envasesXMin + "]";
	}

}
