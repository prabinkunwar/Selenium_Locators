package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	
	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void learnLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
//		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Automation");
		
		// if element node is INPUT use .sendkeys  //  if other then use Robot class
//		driver.findElement(By.className("input-file")).sendKeys("D:\\Tech Fios\\Class Notes\\Selenium\\2022-02-26--Session 1.pptx");
		driver.findElement(By.id("photo")).sendKeys("D:\\Tech Fios\\Class Notes\\Selenium\\2022-02-26--Session 2.pptx");
//		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
//		driver.findElement(By.partialLinkText("TF-API")).click();;
		
		//CSS Selector
		driver.findElement(By.cssSelector("input#sex-1")).click();
//		driver.findElement(By.cssSelector("input[value='5']")).click();
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-1']")).click();
		
		//Xpath (Absolute)
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[10]/input")).sendKeys("Automation QA");
		
		//Xpath (Relative)
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();		
		driver.findElement(By.xpath("//input[@name='tool' and @id='tool-2']")).click();	
		
		//Xpath for links  
		//Tag[text()='Value']
		driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		
		//Tag[contains(text(), 'Value')]
		driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : Page Change')]")).click();

		
		
	}
}
