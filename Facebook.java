package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		String facebook = driver.getTitle();
		System.out.println(facebook);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Create New Account").click();
		
		driver.findElementByName("firstname").sendKeys("Saranya");
		driver.findElementByName("lastname").sendKeys("Chockalingam");
		driver.findElementByName("reg_email__").sendKeys("saranyachokku@gmail.com");
		driver.findElementByName("reg_passwd__").sendKeys("Abcde@123");
		
		WebElement date = driver.findElementByName("birthday_day");
		Select drpDwn1 = new Select(date);
		drpDwn1.selectByIndex(10);
		
		
		WebElement month = driver.findElementByName("birthday_day");
		Select drpDwn2 = new Select(month);
		drpDwn2.selectByValue("9");
		
		WebElement year = driver.findElementByName("birthday_year");
		Select drpDwn3 = new Select(year);
		drpDwn3.selectByVisibleText("1987");
		
		driver.findElementByName("sex").click();
		
		//driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
		
			

	}

}
