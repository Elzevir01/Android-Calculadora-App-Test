package pageModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	WebDriver driver;
	WebElement elemento;

	String expectedTitle = "";

	///// CONSTRUCTOR/////
	public Base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public Base() {
		
	}
	//// METODOS/////
	
	public WebElement findElemento(By elemento) {
		return driver.findElement(elemento);
	}
	public void clickElemento(By elemento) {
		driver.findElement(elemento).click();
	}
	public String textoElemento(By elemento) {
		return driver.findElement(elemento).getText();
	}
	 
}
