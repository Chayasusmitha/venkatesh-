package framework1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginframework {
WebDriver bo;
String buildpath="http://apps.qaplanet.in/hrm/login.php";
void testcase1() {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
	 bo=new ChromeDriver();
	bo.get(buildpath);
	bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	bo.findElement(By.name("txtPassword")).sendKeys("lab1");
	bo.findElement(By.name("Submit")).click();
	//return type() use
	String a=bo.getTitle();
	System.out.println(a);
	if(bo.getTitle().equals("OrangeHRM")) {
		System.out.println("pass");
		
		
	}
	else {
		System.out.println("fail");
	}
	bo.close();
}
	
	void testcase2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		 bo=new ChromeDriver();
		bo.get(buildpath);
		bo.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
		bo.findElement(By.name("txtPassword")).sendKeys("1234");
		bo.findElement(By.name("Submit")).click();
		 String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
		 System.out.println(a);
		 if(a.equals("Invalid Login")) {
			 System.out.println("pass");
		 
			 
		 }
		 
		 else{
			 System.out.println("fail");
			 
		 }
		bo.close();	
	}
		void testcase3() {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
			 bo=new ChromeDriver();
			bo.get(buildpath);
			bo.findElement(By.name("txtUserName")).sendKeys("12345");
			bo.findElement(By.name("txtPassword")).sendKeys("lab1");
			bo.findElement(By.name("Submit")).click();
			String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
			System.out.println(a);
			if(a.equals("Invalid Login")) {
				System.out.println("pass");
				
			}
			else {
				System.out.println("fail");
			}
			bo.close();
			
			
		}
		void testcase4() {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
			bo=new ChromeDriver();
			bo.get(buildpath);
			bo.findElement(By.name("txtUserName")).sendKeys("qwerty");
			bo.findElement(By.name("txtPassword")).sendKeys("12345");
			bo.findElement(By.name("Submit")).click();
			String a=bo.findElement(By.xpath("//font[contains(text(),'Invalid Login')]")).getText();
			System.out.println(a);
			if(a.equals("Invalid Login")) {
				System.out.println("pass");
				
			}
			else {
				System.out.println("fail");
			}
			bo.close();
		}
			
		}
		
	



