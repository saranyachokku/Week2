package Selenium;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByName("UserFirstName").sendKeys("Saranya");
		driver.findElementByName("UserLastName").sendKeys("Chockalingam");
		driver.findElementByName("UserEmail").sendKeys("saranyachokku@gmail.com");
		
		/*WebElement jobTitle = driver.findElement(By.id("UserTitle-jxes"));
		Select drpDwn1 = new Select(jobTitle);
		drpDwn1.selectByIndex(5);*/
		
		WebElement jobTitle = driver.findElementByName("UserTitle");
		Select drpDwn1 = new Select(jobTitle);
		drpDwn1.selectByIndex(5);
		
		driver.findElementByName("CompanyName").sendKeys("Maveric");
		
		WebElement employees = driver.findElementByName("CompanyEmployees");
		Select drpDwn2 = new Select(employees);
		drpDwn2.selectByVisibleText("501 - 1500 employees");
		
		driver.findElementByName("UserPhone").sendKeys("333-666-9999");
		
		WebElement country = driver.findElementByName("CompanyCountry");
		Select drpDwn3 = new Select(country);
		drpDwn3.selectByValue("US");
		
		//ChromeDriver check = driver;
	    //driver.findElement(By.id("I agree to the "));
	    driver.findElementByClassName("checkbox-ui").click();
	   
	    		
	    
		//driver.close();
		

	}

}
