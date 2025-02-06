package Com_Test_2;

import org.testng.annotations.Test;

public class Test_Coma_a2 {

	
	@Test (priority=1)
	public void regisraction_page() {
		
		System.out.println("rgistriccatio");
		
	}
	
	@Test (priority=2)
	public void Login_Page() {
		
		System.out.println("LoginPage");
	}
	
	@Test (priority=3)
	public void HomePage() {
		
		System.out.println("homePage");
		
	}
	
	
	
}
