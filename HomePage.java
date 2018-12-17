package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resourses.base;

public class HomePage extends base{

	@Test
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		//one is inheritance
		//creating object to that class and invoke method of it
		LandingPage l=new LandingPage(driver);
		l.getlogin().click();
	}
}
