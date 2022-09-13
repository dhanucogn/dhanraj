package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom3 {
	//declaration
	@FindBy(xpath = "//span[@class='user-id']")private WebElement gt;
	
	//intilization
	public pom3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
	
	//utilization
	public String m6() {
		String g = gt.getText();
		return g;
		
	}
	

}
