package workingwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practicetestng {
	
  @Test
  
  public void testcase2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
	  WebDriver bo=new ChromeDriver();
	  bo.get("http://apps.qaplanet.in/hrm/login.php");
	  bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	  bo.findElement(By.name("txtPassword")).sendKeys("12345");
	  bo.findElement(By.name("Submit")).click();
	  String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	  System.out.println(a);
	  Assert.assertEquals(a, "Invalid Login");
	  bo.close();
	  
	  
	  
	  
	  
  }
}
