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
	     System.out.println("Main Method Print Statement 123");
	     System.out.println("Changes made for only crazy erperiment branch");
	     String env = System.getenv("DUMMY");
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver(chromeOptions);
	     driver.get("http://google.com");
	     System.out.println("Print the environment variable "+env);
	     System.out.println("Print the environment variable "+env);
	    }
	    @AfterMethod
	    public void afterMethod() {

	    }
	
}
