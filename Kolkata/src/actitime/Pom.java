package actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	//DEC
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement ele;
	///ININ
	Pom(WebDriver driver)//CD and URL---html
	{
		PageFactory.initElements(driver,this);
	}
	//UTITLI
	public void btn()
	{
		ele.click();
	}
}