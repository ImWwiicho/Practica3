package app.poo.ito;

import clases.poo.ito.calzado;

public class MyApp {
	
	static void run() {
		calzado c1 = new calzado(0001, "Cuero", "Pegamento", 1500);
		System.out.println(c1);
		c1.addColores("Negro");
		c1.addColores("Azul");
		c1.addColores("Verde");
		System.out.println(c1);
		c1.delColores("Azul");
		System.out.println(c1);
		
		System.out.println("El costo por lote es de: " + c1.costoxLote(500));
	}

	public static void main(String[] args) {
		run();
	}

}
