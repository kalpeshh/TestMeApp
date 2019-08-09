package Cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ObjectRepository.LoginObject;
import ObjectRepository.PageObject;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CasestudyStepdefinition {
	static WebDriver driver;
	
	
	@Given("Navigate to home page")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}



	@When("^user click on signup button$")
	public void userClickOnSignupButton() throws Throwable {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	
	
	
	@When("^user enter username as \"([^\"]*)\"")
	public void userEnterUsernameAs(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enter firstname as \"([^\"]*)\"$")
	public void userEnterFirstnameAs(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^user enter lastname as \"([^\"]*)\"$")
	public void userEnterLastnameAs(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^user enter password as \"([^\"]*)\"$")
	public void userEnterPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^user enter confirm password as \"([^\"]*)\"$")
	public void userEnterConfirmPasswordAs(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^user enter gender as \"([^\"]*)\"$")
	public void userEnterGenderAs(String arg1) throws Throwable {
		if(arg1.equalsIgnoreCase("male")) {
		driver.findElement(By.xpath("//input[@value='Male']")).click();}
		else
			if(arg1.equalsIgnoreCase("female")) {
				driver.findElement(By.xpath("//input[@value='Female']")).click();
			}
	}

	@When("^user enter email as \"([^\"]*)\"$")
	public void userEnterEmailAs(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^user enter mobile number as \"([^\"]*)\"$")
	public void userEnterMobileNumberAs(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^user enter DOB as \"([^\"]*)\"$")
	public void userEnterDOBAs(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^user enter address as \"([^\"]*)\"$")
	public void userEnterAddressAs(String arg1) throws Throwable {
		driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@And("^user select security question as \"([^\"]*)\" and user selects seurity answer as \"([^\"]*)\"$")
	public void userSelectSecurityQuestionAsAndUserSelectsSeurityAnswerAs(String arg1, String arg2) throws Throwable {
		Select question = new Select(driver.findElement(By.name("securityQuestion")));
		question.selectByVisibleText(arg1);
		driver.findElement(By.name("answer")).sendKeys(arg2);
	}

	
	@And("^user click on register button$")
	public void userClickOnRegisterButton() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}
	
	
	@Then("^user registration is successfull$")
	public void userRegistrationIsSuccessfull() throws Throwable {
       //Assert.assertEquals(driver.getTitle(), "");
	}
	
}	
	