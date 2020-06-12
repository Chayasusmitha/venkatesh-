package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.facebook.com/");
		bo.findElement(By.name("email")).sendKeys("susmitharachamallu@gmail.com");
		bo.findElement(By.name("pass")).sendKeys("sus@229");
		
		String a=bo.getTitle();
		System.out.println(a);
		if(bo.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		bo.get("https://www.facebook.com/");
		bo.findElement(By.name("email")).sendKeys("qwerty");
		bo.findElement(By.name("pass")).sendKeys("12345");
		bo.findElement(By.xpath("//input[@id='u_0_b']")).click();
		String b=bo.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		System.out.println(a);
		if(b.equals("The password that you've entered is incorrect. Forgotten password?\r\n")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
