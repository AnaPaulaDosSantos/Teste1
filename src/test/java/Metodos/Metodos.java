package Metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.Elementos;
import Page.Page1;

public class Metodos {
	
	
		Page1 p = new Page1();
		Elementos e = new Elementos();
		WebDriver driver;
		
		public void PreenchercampoFistname() throws InterruptedException {
			p.click(e.getCampoFistName());
			p.pausar(2000);
			p.preencher(e.getCampoFistName(), "Ana Paula");
			p.pausar(2000);
			p.preencher(e.getCampoLastName(), "Dos Santos");
			p.pausar(2000);	
			p.preencher(e.getCampoAddress(),"quadra 45 lote 15 jardim barragem 2 rua 23");
			p.pausar(2000);
			p.preencher(e.getCampoEmailAddress(),"kaiquecelinosantos@gmail.com" );
			p.pausar(2000);
			p.preencher(e.getCampoPhone(),"61992674328" );
			p.pausar(2000);
			p.click(e.getBtnGender());
			p.pausar(2000);
			p.click(e.getBtnHobbies());
			p.pausar(2000);
			p.click(e.getBtnLanguages());
			p.pausar(2000);
			p.click(e.getBtnLanguagesPortuguese());
			p.pausar(2000);
			p.click(e.getBtnSkills());
			p.pausar(2000);
			p.click(e.getBtnSkillJava());
			p.pausar(2000);
			p.click(e.getBtnCountry());
			p.pausar(2000);
			p.click(e.getBtnSlectCountryUnited());
			p.pausar(2000);
			p.click(e.getBtnYear());
			p.pausar(2000);
			p.click(e.getBtnYear1987());
			p.pausar(2000);
			p.click(e.getBtnMonth());
			p.pausar(2000);
			p.click(e.getBtnMonthJune());
			p.pausar(2000);
			p.click(e.getBtnDay());
			p.pausar(2000);
			p.click(e.getBtnDay28());
			p.pausar(2000);
			p.preencher(e.getCampoPassword(),"123456");
			p.pausar(2000);
			p.preencher(e.getCampoConfirmPassword(), "123456");
			
		}
			
		public void executarNavegador(String site) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get(site);
	        driver.manage().window().maximize();
		}

	
}