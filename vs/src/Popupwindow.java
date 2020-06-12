import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome latest\\chromedriver.exe");
		WebDriver bo = new ChromeDriver();
		bo.get("http://apps.qaplanet.in/hrm/login.php");
		bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		bo.findElement(By.xpath("//input[@name='Submit']")).click();
		//bo.switchTo().alert().accept();
		String a=bo.switchTo().alert().getText();
		System.out.println(a);
		if(a.equals("User Name not given!")) {
			System.out.println("pass");
			
		}
		else {
			System.out.println("fail");
		}
		bo.switchTo().alert().accept();
		bo.close();
		
		
	}

}
