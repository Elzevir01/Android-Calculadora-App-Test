package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageCalc extends pageModel.Base{
	
	//-- NUMEROS--//
	private By uno = By.id("com.sec.android.app.popupcalculator:id/bt_01");
	private By dos = By.id("com.sec.android.app.popupcalculator:id/bt_02");
	private By tres = By.id("com.sec.android.app.popupcalculator:id/bt_03");
	private By cuatro = By.id("com.sec.android.app.popupcalculator:id/bt_04");
	private By cinco = By.id("com.sec.android.app.popupcalculator:id/bt_05");
	private By seis = By.id("com.sec.android.app.popupcalculator:id/bt_06");
	private By siete = By.id("com.sec.android.app.popupcalculator:id/bt_07");
	private By ocho = By.id("com.sec.android.app.popupcalculator:id/bt_08");
	private By nueve = By.id("com.sec.android.app.popupcalculator:id/bt_09");
	private By cero = By.id("com.sec.android.app.popupcalculator:id/bt_00");
	
	//-- OPERADORES --//
	private By division = By.id("com.sec.android.app.popupcalculator:id/bt_div");
	private By multiplicacion = By.id("com.sec.android.app.popupcalculator:id/bt_mul");
	private By resta = By.id("com.sec.android.app.popupcalculator:id/bt_sub");
	private By suma = By.id("com.sec.android.app.popupcalculator:id/bt_add");
	
	//-- FUNCIONES Y OBJETOS --//
	private By igual = By.id("com.sec.android.app.popupcalculator:id/bt_equal");
	private By limpiar = By.id("com.sec.android.app.popupcalculator:id/bt_clear");
	private By resultado = By.id("com.sec.android.app.popupcalculator:id/txtCalc");

	/////-- CONSTRUCTOR --/////
	public PageCalc(WebDriver driver) {
		super.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//////-- METODOS --/////
	public void numero(int numero) {
		switch(numero) {
		case 1:
			clickElemento(uno);
			break;
		case 2:
			clickElemento(dos);
			break;
		case 3:
			clickElemento(tres);
			break;
		case 4:
			clickElemento(cuatro);
			break;
		case 5:
			clickElemento(cinco);
			break;
		case 6:
			clickElemento(seis);
			break;
		case 7:
			clickElemento(siete);
			break;
		case 8:
			clickElemento(ocho);
			break;
		case 9:
			clickElemento(nueve);
			break;
		case 0:
			clickElemento(cero);
			break;	
		}
	}
	
	public void operacion(int numero) {
		switch(numero) {
		case 1:
			clickElemento(suma);
			System.out.println("Suma (+)");
			break;
		case 2:
			clickElemento(resta);
			System.out.println("Resta (-)");
			break;
		case 3:
			clickElemento(multiplicacion);
			System.out.println("Suma (*)");
			break;
		case 4:
			clickElemento(division);
			System.out.println("Suma (/)");
			break;
		}
	}
	
	public void igual() {
		clickElemento(igual);
	}
	public void limpiar() {
		clickElemento(limpiar);
	}
	
	public String resultado() {
		return textoElemento(resultado);
	}
}
