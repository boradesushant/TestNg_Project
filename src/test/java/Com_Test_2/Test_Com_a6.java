package Com_Test_2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Com_a6  extends Base{
	
	@Test
	public void Submit() {
		
		
		driver.findElement(By.name("submit")).click();
	}

}
