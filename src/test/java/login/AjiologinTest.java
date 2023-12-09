package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AjiologinTest {
  @Test
  public void AjioTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Chrome downlode file\\Chrome driver Selenium\\chromedriver-win64\\chromedriver.exe");
	  Reporter.log("Opening  Ajio",true);
	  WebDriver driver =new ChromeDriver ();
	  driver.get("https://www.ajio.com/");
	  driver.quit()...;
  }
}
