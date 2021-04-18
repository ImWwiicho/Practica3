package app.poo.ito;
import clases.poo.ito.Lavado;
import clases.poo.ito.LlenadoYEnvasado;
import clases.poo.ito.Empaquetado;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Lavado L1=new Lavado("L3-4001 SpeedClean", LocalDate.now(), 1500, 20);
		System.out.println(L1);
		System.out.println(L1.costoLavado());
		
		LlenadoYEnvasado LLyE1=new LlenadoYEnvasado("Modular 400k10", LocalDate.now(), 5000, 15);
		System.out.println(LLyE1);
		System.out.println(LLyE1.costoLLyE());
		
		Empaquetado E1=new Empaquetado("Industrial F00190-Z ", LocalDate.now(), 8500, 3);
		E1.addTipoDeEmpaques(9);
		System.out.println(E1);
		System.out.println(E1.costoEmpaquetado());
	}

	public static void main(String[] args) {
		run();
	}

}
