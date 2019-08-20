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

public class LoginFeatureStepdefinition {

	static WebDriver driver;
	

	@Given("Navigate to Home page")
	public void navigateToHomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Then("user logged in successfully")
	public void userLoggedInSuccessfully() throws Throwable {
		System.out.println("User login successfully");
		Assert.assertEquals(driver.getTitle(), "Home");
		

	}




	@When("user enters username and password")
	public void userentersusernameandpassword() throws Throwable {
		
		PageObject po = PageFactory.initElements(driver, PageObject.class);

		LoginObject lo = PageFactory.initElements(driver, LoginObject.class);

		//po.signin.click();

		lo.username.sendKeys("Linda");

		lo.password.sendKeys("Password122");

		lo.Login.click();
	}


	@When("click on checkout")
	public void clickOnCheckout() throws Throwable {
		driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	}

	

	@When("select bank and credentials")
	public void selectbankandcredentials() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		
		driver.findElement(By.xpath("//label[contains(text(),'HDFC')]")).click();
		driver.findElement(By.xpath("//a[@href='#']")).click();
		driver.findElement(By.xpath("//input[contains(text(),'username')]")).sendKeys("123457");
		driver.findElement(By.xpath("//input[contains(text(),'password')]")).sendKeys("pass@457");
	}

	

	@Given("^Navigate to All Categories - Electronics and Headphone$")
	public void navigateToAllCategoriesElectronicsAndHeadphone() throws Throwable {
		//driver.findElement(By.xpath("//span[contains(text(),'All')]")).click();
	      //driver.findElement(By.xpath("//span[@onclick='getSubCategoryList('11290')']")).click();
	      //driver.findElement(By.xpath("//span[contains(text(),'Travel')]")).click();
	     driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Hand bag");
	     driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@And("^Add Product to cart$")
	public void addProductToCart() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	}


	@And("^user click on signup$")
	public void userClickOnSignup() throws Throwable {
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}


	@When("^user enter username$")
	public void userEnterUsername() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("Linda216");
	}


	@When("^user enter fname$")
	public void userEnterFname() throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys("linda");
	}


	@When("^user enter lname$")
	public void userEnterLname() throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys("lname");
	}


	@When("^user enter password$")
	public void userEnterPassword() throws Throwable {
	driver.findElement(By.name("password")).sendKeys("password122");
	}


	@When("^user enter confirm password$")
	public void userEnterConfirmPassword() throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys("password122");
	}


	@When("^user enter gender$")
	public void userEnterGender() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}


	@When("^user enter email$")
	public void userEnterEmail() throws Throwable {
	     driver.findElement(By.name("emailAddress")).sendKeys("linda12@gmail.com");
	}


	@When("^user enter mob$")
	public void userEnterMob() throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys("1234567890");
	}


	@When("^user enter dob$")
	public void userEnterDob() throws Throwable {
		driver.findElement(By.name("dob")).sendKeys("1/01/1997");
	
	}


	@When("^user enter address$")
	public void userEnterAddress() throws Throwable {
		driver.findElement(By.name("address")).sendKeys("12q marg road");
	}


	@When("^user select security question$")
	public void userSelectSecurityQuestion() throws Throwable {
		Select question= new Select(driver.findElement(By.name("securityQuestion")));
		question.selectByVisibleText("What is your favour color?");
		driver.findElement(By.name("answer")).sendKeys("red");
	}


	@When("^user clicks on button$")
	public void userClicksOnButton() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}


	@Then("^user registration is succesfull$")
	public void userRegistrationIsSuccesfull() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Login");
	}


	@Then("^redirected to Thankyou page$")
	public void redirectedToThankyouPage() throws Throwable {
	
	}


	

	

	
	

}
