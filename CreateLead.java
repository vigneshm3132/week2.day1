package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vignesh");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("M");
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("ABC COMPANY");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(source);
		dd1.selectByVisibleText("Employee");
		
		WebElement marketingCampaignId = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(marketingCampaignId);
		dd2.selectByValue("9001");
		
		WebElement currencyUomId = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dd3 = new Select(currencyUomId);
		dd3.selectByIndex(1);
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd4 = new Select(industry);
		dd4.selectByValue("IND_FINANCE");
		//dd2.selectByVisibleText("Finance");
		
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dd5 = new Select(ownership);
		dd5.selectByIndex(2);
		//dd3.selectByVisibleText("Partnership");
		
		driver.findElement(By.name("birthDate")).sendKeys("01/02/90");
		
		
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	}

}
