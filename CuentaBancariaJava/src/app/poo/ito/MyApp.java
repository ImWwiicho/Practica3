package app.poo.ito;

import java.time.LocalDate;
import clases.ito.poo.CuentaBancaria;

public class MyApp {
	
	static void run() {
		CuentaBancaria c1= new CuentaBancaria(89393L, "Lucia Mendoza", 15000, LocalDate.of(2021, 2, 18));
		System.out.println(c1);
		
		System.out.println(c1.retiro(17000));
		System.out.println(c1);
		System.out.println(c1.retiro(1000));
		System.out.println(c1);
		
		System.out.println(c1.deposito(2000));
		System.out.println(c1);
		
		c1.setFechaApertura(LocalDate.of(2021,9,20));
		System.out.println(c1.deposito(33333));
		System.out.println(c1);
	}

	public static void main(String[] args) {
		run();
	}

}
