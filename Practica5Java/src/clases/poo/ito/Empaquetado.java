package clases.poo.ito;
import java.time.LocalDate;

public class Empaquetado extends Maquina {
	
	private int tipoDeEmpaque = 0;
	private float empaquesXMin = 0F;


	public Empaquetado() {
		super();
	}
	
	public Empaquetado (String descripcion, LocalDate fechaAdd, int costo, float empaquesXMin) {
		super(descripcion, fechaAdd, costo);
		this.empaquesXMin = empaquesXMin;
	}

	//============================================================
	public float costoEmpaquetado() {
		// Start of user code for method costoEmpaquetado
		float costoEmpaquetado = 0F;
		costoEmpaquetado = (0.0006F*getCosto())/(this.empaquesXMin*this.tipoDeEmpaque);
		return costoEmpaquetado;
		// End of user code
	}

	//============================================================
	public void addTipoDeEmpaques(int newTipoDeEmpaque) {
		this.tipoDeEmpaque = newTipoDeEmpaque;
	}
	
	//============================================================
	public int getTipoDeEmpaques() {
		return this.tipoDeEmpaque;
	}

	//============================================================
	public float getEmpaquesXMin() {
		return this.empaquesXMin;
	}

	//============================================================
	public void setEmpaquesXMin(float newEmpaquesXMin) {
		this.empaquesXMin = newEmpaquesXMin;
	}
	
	@Override
	public String toString() {
		return "Maquina de llenado y envasado [Descripcion: "+ getDescripcion() + ", Fecha Adquisicion: " + getFechaAdd()  
		+  ", Costo: "+ getCosto() +", Empaques por minuto: " + empaquesXMin + ", Tipo de empaque: "+ tipoDeEmpaque +" botellas]";
	}

}
