package Com_Test_2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Com_a3 {

	// TestNG (ANNOtation)
	
	@BeforeSuite 
	public void BS () {
		
		System.out.println("Before Suite");
		
	}
	@BeforeTest
		public void BT() {
			
		System.out.println("Before Test");
	}
	@BeforeClass
	public void BC() {
		
		System.out.println("Before Class");
	}
	
	@BeforeMethod   
	public void BM() {
		
		System.out.println("Before Method--Browser open");
		
	}
	@Test
	public void xyz() {
		
		System.out.println("Test xyz");
	}
	@Test
	public void abc() {
		
		System.out.println("Test abc");
	}
	@AfterMethod   
	public void AF() {
		
		System.out.println("After Method--Browser Colse");
	}
	@AfterClass
	public void AC() {
		
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AT() {
		
		System.out.println("after Test");
	}
	@AfterSuite
	public void AS() {
	
	System.out.println("After Suite");
	}
}
