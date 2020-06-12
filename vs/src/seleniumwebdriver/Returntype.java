package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Returntype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.kmart.com.au/");
		String a=bo.getTitle();
		System.out.println(a);
		bo.getCurrentUrl();
		String b=bo.getCurrentUrl();
		System.out.println(b);
		bo.getPageSource();
		String c=bo.getPageSource();
		System.out.println(c);
		//navigation commands
		Navigation d=bo.navigate();
		d.to("https://www.coles.com.au/");
		d.back();
		d.forward();
		d.refresh();
		bo.close();
		
		
		
		

	}

}
