package Com_Test_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Com_a12 extends Test_Com_a11 {

	@Test
	
	public void xyz() {
		
		driver.findElement(By.id("email")).sendKeys("TestingGmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pass@123");
       driver.findElement(By.name("login")).click();
	}
	
}
