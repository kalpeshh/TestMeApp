package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PageObject {

	
	
	
	@FindBy(how = How.XPATH,using = "//a[@href='login.htm']")
	 
	public WebElement signin;


	
}
	

