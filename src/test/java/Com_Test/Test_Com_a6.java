package Com_Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a6 {

	public static void main(String[] args) throws IOException {

    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.orangehrm.com/en/book-a-free-demo");
		driver.manage().window().maximize();
		
     WebElement   Contry=driver.findElement(By.xpath("//select[@name='Country']"));
   
     Select select=new Select(Contry);
     
     select.selectByIndex(11);
     
     select.selectByVisibleText("India");
     
     // full page ScreenShots
     TakesScreenshot ts=driver;
     
   File  src=ts.getScreenshotAs(OutputType.FILE);
     
     File Desten=new File("C:\\Users\\Sai\\eclipse-workspace\\TestNG_Project//Scree.png");
     
     FileUtils.copyFile(src, Desten);
     
     
	}

}
