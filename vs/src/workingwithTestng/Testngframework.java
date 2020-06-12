package workingwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngframework {
	WebDriver bo;
	String buildpath="http://apps.qaplanet.in/hrm/login.php";
  @Test(enabled=true,priority=1,groups="login")
  public void testcase1() {
	  
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		// return type() use
		String a = bo.getTitle();
		System.out.println(a);
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		
		
  }
  @Test(enabled=true,priority=2,groups="login")
  public void testcase2() {
	  
	  bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	  bo.findElement(By.name("txtPassword")).sendKeys("12345");
	  bo.findElement(By.name("Submit")).click();
	  String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	  System.out.println(a);
	  Assert.assertEquals(a, "Invalid Login");
		
		
  }
  @Test(enabled=true,priority=3,groups="login")
  public void testcase3() {
	  
	  bo.findElement(By.name("txtUserName")).sendKeys("qwerty");
	  bo.findElement(By.name("txtPassword")).sendKeys("12345");
	  bo.findElement(By.name("Submit")).click();
	  String b=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	  System.out.println(b);
	  Assert.assertEquals(b, "Invalid Login");
  }
  @Test(enabled=true,priority=4,groups="login")
  public void testcase4() {
	  
	  bo.findElement(By.name("txtUserName")).sendKeys("qwerty");
	  bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	  bo.findElement(By.name("Submit")).click();
	  String b=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
	  System.out.println(b);
	  Assert.assertEquals(b, "Invalid Login");
  }
		
  
  @BeforeMethod
		 void buildexecution() {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		bo = new ChromeDriver();
		bo.get(buildpath);
			 
	  
  }
  @AfterMethod
		 void buildclose() {
	  bo.close();
			 
		 }
  
  }
		 
		 
			 
		 
		 
		 
		
  
  

