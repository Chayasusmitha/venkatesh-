package workingwithTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		// return type() use
		String a = bo.getTitle();
		System.out.println(a);
		Assert.assertEquals(bo.getTitle(), "OrangeHRM");
		/*
		 * if(bo.getTitle().equals("OrangeHRM")) { System.out.println("pass");
		 * 
		 * 
		 * } else { System.out.println("fail"); }
		 */
		bo.close();
	}

	@Test
	void testcase2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("1234");
		bo.findElement(By.name("Submit")).click();
		String a = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "Invalid Login");
		/*
		 * if(a.equals("Invalid Login")) { System.out.println("pass");
		 * 
		 * 
		 * }
		 * 
		 * else{ System.out.println("fail");
		 * 
		 * }
		 */
		bo.close();

	}

	@Test
	void testcase3() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("12345");
		bo.findElement(By.name("txtPassword")).sendKeys("lab1");
		bo.findElement(By.name("Submit")).click();
		String a = bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "Invalid Login");
		/*
		 * if(a.equals("Invalid Login")) { System.out.println("pass");
		 * 
		 * } else { System.out.println("fail"); }
		 */
		bo.close();
	}
	
	@Test
	void testcase4() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.name("txtUserName")).sendKeys("qwerty");
		bo.findElement(By.name("txtPassword")).sendKeys("12345");
		bo.findElement(By.name("Submit")).click();
		String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		System.out.println(a);
		Assert.assertEquals(a, "Invalid Login");
		/*
		 * if(a.equals("Invalid Login")) { System.out.println("pass");
		 * 
		 * } else { System.out.println("fail"); }
		 */
		bo.close();
	}
}

