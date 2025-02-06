package Com_Test_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a4 {
   ChromeDriver driver;
   
	@BeforeMethod
	public void BT() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void verifyElelemnt () {
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("TestingGmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
	@AfterMethod
	public void TearDown() {
		
		
		driver.close();
		
	}
	
	
	
}
