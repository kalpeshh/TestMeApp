package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchObject {

	@FindBy(how = How.XPATH,using = "//input[@value='FIND DETAILS']")
	public WebElement addtocart;

	@FindBy(name = "password")
	public WebElement home;
}
