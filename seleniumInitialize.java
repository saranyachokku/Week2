package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumInitialize {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		//driver.close();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		String title1="My Home | opentaps CRM";
		String homeTitle = driver.getTitle();
		
		if(title1.equals(homeTitle)) {
			System.out.println("In the Homepage");
		}
		
		else
			System.out.println("In the Homepage");
		}

}
