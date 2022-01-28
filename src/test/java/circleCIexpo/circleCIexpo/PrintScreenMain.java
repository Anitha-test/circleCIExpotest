package circleCIexpo.circleCIexpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintScreenMain {

	 WebDriver driver;

	    @BeforeMethod
	    public void beforeMethod() {

	  
	    }

	    @Test
	    public void navigateToAUrl() {
	     System.out.println("Main Method Print Statement");
	    }
	    @AfterMethod
	    public void afterMethod() {

	    }
	
}
