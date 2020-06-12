package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalidtestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
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

}
