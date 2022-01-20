package Cpmpany_name.SALEEM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\wali\\eclipse-workspace\\SALEEM\\src\\Drivers\\chromedriver.exe");
	driver =new ChromeDriver();
	String url="https://www.flickr.com/";
	driver.navigate().to(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	
	String a=driver.getWindowHandle();
	System.out.println(a);
	
	String b=driver.getTitle();
	System.out.println(b);
	driver.quit();
	

	}

}
