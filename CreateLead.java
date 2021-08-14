package Selenium;

//public class CreateLead{
	
	import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLead {
		
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
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Maveric");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chockalingam");
			
			WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select drpDwn1 = new Select(drop1);
			drpDwn1.selectByIndex(4);
			//driver.findElement(By.className("smallSubmit")).click();
			
			WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select drpDwn2 = new Select(drop2);
			drpDwn2.selectByValue("CATRQ_AUTOMOBILE");
			//driver.findElement(By.className("smallSubmit")).click();
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saranya");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Chockalingam");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Madam");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/2021");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100");
			
			WebElement drop3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
			Select drpDwn3 = new Select(drop3);
			drpDwn3.selectByVisibleText("USD - American Dollar");
			
			WebElement drop4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select drpDwn4 = new Select(drop4);
			drpDwn4.selectByIndex(1);
			
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("369");			
			
			WebElement drop5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select drpDwn5 = new Select(drop5);
			drpDwn5.selectByValue("OWN_PARTNERSHIP");
			
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("3333");		
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("***");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("All is Well");
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("That Ends Well");
			
			WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
			countryCode.clear();
			countryCode.sendKeys("69");
			
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("385");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("385-347-9645");
			driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+1");
			driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sara");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("saranyachokku@gmail.com");
			driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.saralax.com");
			
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Saran");
			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Laxsar");
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Apt#666");
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("XYZ Street");
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Frisco");
			
			WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select drpDwn6 = new Select(stateProvince);
			drpDwn6.selectByValue("TX");
			
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("75034");
			
			WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			Select drpDwn7 = new Select(country);
			drpDwn7.selectByVisibleText("United States");
			
			driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("001");
			
			driver.findElement(By.className("smallSubmit")).click();
			

}
	
}