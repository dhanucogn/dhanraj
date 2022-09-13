package base;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.pom1;
import pom.pom2;
import pom.pom3;

public class test1 extends Baseclass {
	pom1 a;
	pom2 b;
	pom3 c;
	@BeforeClass
	public void open() {
		openbrowser();
		 a=new pom1(driver);
		 b=new pom2(driver);
		 c=new pom3(driver);
	}
	@BeforeMethod
	public void openappl() throws Throwable {
		a.m1(utilityclass.gettd(0, 0));
		a.m2(utilityclass.gettd(0, 1));
		a.m3();
		b.m4(utilityclass.gettd(0, 2));
		b.m5();
	}
	@Test
	public void veri() throws Throwable {
		String act=utilityclass.gettd(0, 0);
		String exp=c.m6();
		Assert.assertEquals(act, exp);
		
	}
	@AfterMethod
	public void closeapll() {
		Reporter.log("close apll",true);
	}
	@AfterClass
	public void closebr() {
		Reporter.log("closebr",true);
	}
	
		 
		
		
		
	

}
