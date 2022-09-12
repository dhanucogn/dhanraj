package pom;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
// ppooomm
public class pom1 {
	//declaration
	@FindBy(xpath ="//input[@id='userid']")private WebElement user;
	@FindBy(xpath = "//input[@id='password']")private WebElement pass;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement buuton1;
	
	//intilization
	public pom1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	
	public void m1(String name) {
		user.sendKeys(name);
		
	}
	public void m2(String pw) {
		pass.sendKeys(pw);
		
	}
	public void m3() {
		buuton1.click();
		
	}
	
	
	
	
	

}
