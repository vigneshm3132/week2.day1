package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		//to find the webdriver path
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		
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
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
		
		
	}
}
