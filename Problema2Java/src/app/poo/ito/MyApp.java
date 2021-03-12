package app.poo.ito;

import clases.poo.ito.Fruta;

public class MyApp {
	
	static void run() {
		Fruta f1= new Fruta("Manzana", 10000, 1.50F, 3.50F);
		System.out.println(f1);
		
		f1.agregarPeriodo("Enero 2021", 10565);
		f1.agregarPeriodo("Febrero 2021", 8500);
		f1.agregarPeriodo("Marzo 2021", 2333);
		System.out.println(f1);
		
		System.out.println(f1.eliminarPeriodo(5));
		System.out.println(f1);
		System.out.println(f1.eliminarPeriodo(2));
		System.out.println(f1);
		
		System.out.println(f1.costoPeriodo(5));
		System.out.println(f1.costoPeriodo(2));
		
		System.out.println(f1.ganancia(5));
		System.out.println(f1.ganancia(2));
	}

	public static void main(String[] args) {
		run();
	}

}
