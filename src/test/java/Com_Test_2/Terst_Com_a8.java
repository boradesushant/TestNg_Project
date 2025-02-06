package Com_Test_2;

import org.testng.annotations.Test;

public class Terst_Com_a8 {

	@Test (groups= {"regression"})
	public void m1() {
		
		System.out.println("m1");
	}
	@Test  (groups= {"critcal regression"})
	public void m2() {
		
		System.out.println("m2");
	}
	@Test  (groups= {"regression"})
	public void m3() {
		
		System.out.println("m3");
	}
	@Test (groups= {"critcal regression"})
	public void m4() {
		
		System.out.println("m4");
	}
	
}
