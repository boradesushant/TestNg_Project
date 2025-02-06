package Com_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a4 {

	public static void main(String[] args) {

// mouce move Eleennt
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		// Actions class
		Actions act=new Actions(driver);
		
	//WebElement	doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
	//act.doubleClick(doubleclick).click().build().perform();
	

	WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
WebElement 	text=driver.findElement(By.xpath("//span[text()='Edit']"));
	act.contextClick(rightclick).click(text).build().perform();
	
	
	}
	public static void Handle_Alert (ChromeDriver driver) {
		
		Alert alt=driver.switchTo().alert();
		
		String text=alt.getText();
		
		System.out.println(text);
		alt.accept();
	}

}
