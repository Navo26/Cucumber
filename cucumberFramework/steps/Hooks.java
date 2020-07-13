package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ProjectSpecificMethods {
	@Before
	public void preCondition(Scenario sc) {
		
		openApp();
		System.out.println(sc.getName());
	}
	
	@After
	public void postCondition(Scenario sc) {
		closeBrowser();
		System.out.println(sc.getStatus());

	}

}
