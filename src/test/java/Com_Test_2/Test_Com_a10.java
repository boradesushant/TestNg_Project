package Com_Test_2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Test.PomClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a10 {

	
	@Test 
	public void xyz () {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		PomClass pom=PageFactory.initElements(driver, PomClass.class);
		
		pom.getText_Email().sendKeys("TestingGmail.Com");
		
		pom.getText_Pass().sendKeys("Pass@123");
		
		pom.getText_Button().click();
		
		
	}
	
}
