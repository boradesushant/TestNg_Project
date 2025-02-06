package Com_Test_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Com_a5  extends Base{

	// inheritace class base acquired all properties base
	
	@Test
	
	public void XYZ() {
		
		
		driver.findElement(By.name("firstName")).sendKeys("xyz");
		driver.findElement(By.name("lastName")).sendKeys("asw");

		driver.findElement(By.name("phone")).sendKeys("12345678");

		driver.findElement(By.name("userName")).sendKeys("userName");
		
		

	}
	
	
	
}
