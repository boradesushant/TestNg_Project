package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a3 {

	public static void main(String[] args) {
		
		// open Browser
		
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
       driver.manage().window().maximize();
    
    Actions act=new Actions(driver);
    
  WebElement  Email=driver.findElement(By.xpath("//input[@name='firstName']"));
		
    act.keyDown(Email, Keys.SHIFT).sendKeys("aqw").keyUp(Keys.SHIFT).build().perform();
    
    act.keyDown(Email, Keys.SHIFT).sendKeys("a").keyUp(Keys.SHIFT).build().perform();

    act.keyDown(Email, Keys.SHIFT).sendKeys("c").keyUp(Keys.SHIFT).build().perform();
    

	
	}

}
