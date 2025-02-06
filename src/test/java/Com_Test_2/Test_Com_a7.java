package Com_Test_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Com_a7 {

	
	@Test
	
	public void m1(){
		
		System.out.println("Test m1");
		
		Assert.assertTrue(false);
		
	}
	@Test (dependsOnMethods="m1")
	
	public void m2() {
		
		System.out.println("Test m2");
	}
	@Test (invocationCount=3)
	
	public void m3() {
		
		System.out.println("Test m3");
	}
	@Test
	
	public void m4() {
		
		System.out.println("Test m4");
	}
}
