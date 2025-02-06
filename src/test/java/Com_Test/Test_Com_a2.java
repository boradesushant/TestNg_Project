package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a2 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
 WebElement  frame=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
 
 driver.switchTo().frame(frame);
 
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("test");
		
	WebElement	innerframe=driver.findElement(By.xpath("(//iframe)[1]"));
	
	driver.switchTo().frame(innerframe);
	driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
		
	}

}
