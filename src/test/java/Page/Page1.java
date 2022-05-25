package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;
	
	
	public void pausar(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	public void click(By elemento) {
		driver.findElement(elemento).click();
 	}
	public void preencher( By elemento , String mensagem) {
		driver.findElement(elemento).sendKeys(mensagem);
	
	}
}
