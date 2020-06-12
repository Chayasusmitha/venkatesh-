package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siva {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
	bo.get("https://www.redbus.in/");
	bo.getTitle();
	System.out.println(bo.getTitle());
	Thread.sleep(3000);
	bo.getCurrentUrl();
	System.out.println(bo.getCurrentUrl());
	bo.getPageSource();
	System.out.println(bo.getPageSource());
	
	//navigation commands
	bo.navigate().to("https://www.facebook.com");
	bo.navigate().back();
	bo.navigate().forward();
	bo.navigate().refresh();
	bo.close();

	}

}
