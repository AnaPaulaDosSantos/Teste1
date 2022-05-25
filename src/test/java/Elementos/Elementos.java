package Elementos;

import org.openqa.selenium.By;

public class Elementos {
	  private By campoFistName = By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input");
	  private By campoLastName = By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input");
	  private By campoAddress = By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea");
	  private By campoEmailAddress = By.cssSelector("#eid > input");
	  private By campoPhone = By.cssSelector("#basicBootstrapForm > div:nth-child(4) > div > input");
	  private By BtnGender = By.cssSelector("#basicBootstrapForm > div:nth-child(5) > div > label:nth-child(1) > input");
	  private By BtnHobbies = By.id("checkbox2");
	  private By BtnLanguages = By.cssSelector("#msdd");
	  private By BtnLanguagesPortuguese = By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li.ng-scope.ui-elemfocus > a"); 
	  private By BtnSkills = By.id("Skills"); 
	  private By BtnSkillJava = By.cssSelector("#Skills > option:nth-child(39)");
	  private By BtnCountry = By.id("countries");
	  private By BtnSelectCountry = By.id("select2-country-container");
	  private By BtnSlectCountryUnited = By.cssSelector("#select2-country-results > li.select2-results__option.select2-results__option--highlighted");
	  private By BtnYear = By.id("yearbox");
	  private By BtnYear1987 = By.cssSelector("#yearbox > option:nth-child(73)");
	  private By BtnMonth = By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select");
	  private By BtnMonthJune = By.cssSelector("#basicBootstrapForm > div:nth-child(11) > div:nth-child(3) > select > option:nth-child(7)");
	  private By BtnDay = By.id("daybox");
	  private By BtnDay28 = By.cssSelector("#daybox > option:nth-child(29)");
	  private By campoPassword = By.id("firstpassword");
	  private By campoConfirmPassword = By.id("secondpassword");
	public By getCampoFistName() {
		return campoFistName;
	
	}
	public By getCampoLastName() {
		return campoLastName;
	
	}
	public By getCampoEmailAddress() {
		return campoEmailAddress;
	
	}
	public By getCampoAddress() {
		return campoAddress;
	}
	
	
	public By getCampoPhone() {
		return campoPhone;
	}
	
	
	public By getBtnHobbies() {
		return BtnHobbies;

	}
	public By getBtnGender() {
		return BtnGender;
	
	}
	public By getBtnLanguages() {
		return BtnLanguages;
	
	}
	public By getBtnLanguagesPortuguese() {
		return BtnLanguagesPortuguese;
	
	}
	
	public By getBtnSkills() {
		return BtnSkills;
	
	}
	public By getBtnSkillJava() {
		return BtnSkillJava;
	
	}
	public By getBtnCountry() {
		return BtnCountry;
	
	}
	public By getBtnSelectCountry() {
		return BtnSelectCountry;
	}
	public By getBtnSlectCountryUnited() {
		return BtnSlectCountryUnited;
	
	}
	public By getBtnYear() {
		return BtnYear;
	}
	public void setBtnYear(By btnYear) {
		BtnYear = btnYear;
	}
	public By getBtnYear1987() {
		return BtnYear1987;
	}
	public void setBtnYear1987(By btnYear1987) {
		BtnYear1987 = btnYear1987;
	}
	public By getBtnMonth() {
		return BtnMonth;
	}
	public void setBtnMonth(By btnMonth) {
		BtnMonth = btnMonth;
	}
	public By getBtnMonthJune() {
		return BtnMonthJune;
	}
	public void setBtnMonthJune(By btnMonthJune) {
		BtnMonthJune = btnMonthJune;
	}
	public By getBtnDay() {
		return BtnDay;
	}
	public void setBtnDay(By btnDay) {
		BtnDay = btnDay;
	}
	public By getBtnDay28() {
		return BtnDay28;
	}
	public void setBtnDay28(By btnDay28) {
		BtnDay28 = btnDay28;
	}
	public By getCampoPassword() {
		return campoPassword;
	}
	public void setCampoPassword(By campoPassword) {
		this.campoPassword = campoPassword;
	}
	public By getCampoConfirmPassword() {
		return campoConfirmPassword;
	}
	public void setCampoConfirmPassword(By campoConfirmPassword) {
		this.campoConfirmPassword = campoConfirmPassword;
	}

}
