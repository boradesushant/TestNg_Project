package Com_Test;

import org.openqa.selenium.Alert;
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
	
	Actions act=new Actions(driver);
	
	WebElement Rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
	
	WebElement edit=driver.findElement(By.xpath("//span[text()='Copy']"));
	

	act.contextClick(Rightclick).click(edit).build().perform();
	
	Alert alt=driver.switchTo().alert();
	
	String text=alt.getText();
	
	System.out.println(text);
	
	
	}

}
