package Com_Test_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	ChromeDriver driver;
	@BeforeMethod
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();	
		
	}
	
	@AfterMethod
	public void TearDown() {
		
	//	driver.close();
		
	}
}
