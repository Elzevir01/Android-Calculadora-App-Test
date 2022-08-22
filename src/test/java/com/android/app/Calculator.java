package com.android.app;

import org.testng.annotations.Test;

import driver.BrowserFactory;
import driver.DriverFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import pageModel.PageCalc;
import driver.BrowserFactory;

public class Calculator {
	WebDriver driver;
	BrowserFactory bf = null;
	PageCalc pc;
	int numero;
	String cadenaNumero = "";

	@Test
	public void androidCalc() {
		pc = new PageCalc(driver);
		/// numero de entre una a cuatro digitos///
		numero = numeroRandom(1, 4);

		for (int i = 0; i < numero; i++) {
			numero = numeroRandom(0, 9);
			pc.numero(numero);
			cadenaNumero = cadenaNumero + String.valueOf(numero);
		}
		/// mostrar la cadena del primer numero///
		System.out.println("primer numero: " + cadenaNumero);
		cadenaNumero = "";
		/// operacion aleatoria///
		pc.operacion(numeroRandom(1, 4));

		/// segundo numero entre uno y 4 digitos
		numero = numeroRandom(1, 4);
		for (int i = 0; i < numero; i++) {
			numero = numeroRandom(0, 9);
			pc.numero(numero);
			cadenaNumero = cadenaNumero + String.valueOf(numero);
		}
		/// mostrar la cadena del segundo numero///
		System.out.println("segundo numero: " + cadenaNumero);
		cadenaNumero = "";
		/// iniciar operacion///
		pc.igual();
		System.out.println("Resultado: " + pc.resultado());
		/// esperar////
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeTest
	@Parameters("nodeUrl")
	public void beforeTest(String nodeUrl) {
		try {
			bf = new BrowserFactory();
			DriverFactory.getInstance().setDriver(bf.setDriver(nodeUrl));
			driver = DriverFactory.getInstance().getDriver();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@AfterTest
	public void afterTest() {
		bf.removeDriver();
	}

	public int numeroRandom(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}
}
