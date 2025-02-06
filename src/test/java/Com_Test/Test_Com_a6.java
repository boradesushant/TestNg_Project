package Com_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a6 {

	public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		driver.manage().window().maximize();
		
     WebElement   Contry=driver.findElement(By.xpath("//select[@name='Country']"));
   
     Select select=new Select(Contry);
     
     select.selectByIndex(11);
     
     select.selectByVisibleText("India");
     
     
	}

}
