package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2 {
	//declaration
	@FindBy(xpath = "//input[@id='pin']")private WebElement pinn;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement button2;
	
	//intilization
	public pom2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	public void m4(String pi) {
		pinn.sendKeys(pi);
	}
	public void m5() {
		button2.click();
	}

}
