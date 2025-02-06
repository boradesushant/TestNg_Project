package Com_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a1 {

	public static void main(String[] args) {


		/// Execuation SetUp() 
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// handle drop Down
		
	WebElement	DrpContry=driver.findElement(By.xpath("//select[@name='country']"));
		
	handle_DropDown(DrpContry,"INDIA");
	
	}
	public static void handle_DropDown(WebElement Element,String value) {
		
		
		Select select=new Select(Element);

		select.selectByValue(value);
	}

}
