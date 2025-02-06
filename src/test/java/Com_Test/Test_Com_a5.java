package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a5 {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// Actions class
		Actions act=new Actions(driver);
		
	WebElement	doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	act.doubleClick(doubleclick).click().build().perform();
	
	Test_Com_a4.Handle_Alert(driver);
	
	
	}

}
