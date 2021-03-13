package app.poo.ito;

import clases.poo.ito.CuerpoCeleste;
import clases.poo.ito.Ubicacion;

public class MyApp {
	
	static void run(){
		Ubicacion u1=new Ubicacion(121524, 134955, "Enero", 3400293, "kilometros");
		Ubicacion u2=new Ubicacion(724573, 590024, "Febrero", 4700389, "kilometros");
		CuerpoCeleste cc1=new CuerpoCeleste("Venus", "Gaseoso");
		
		System.out.println(u1);
		System.out.println(cc1);
		
		cc1.addLocalizaciones(u1);
		cc1.addLocalizaciones(u2);
		System.out.println(cc1);
		
		System.out.println(cc1.desplazamiento(3400293,4700389));
		System.out.println(cc1.desplazamiento(3400293,4700381));
		System.out.println(cc1.desplazamiento(4700389,3400293));
	}

	public static void main(String[] args) {
		run();
	}

}
