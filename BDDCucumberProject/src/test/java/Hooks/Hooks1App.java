package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks1App 
{
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!Before All!!!!!!!!!!!!!!");
	}
	
	@Before
	public void beforeScenario()
	{
		System.out.println("*******************Running before scenario************");
	}
	
	
	
	
	@After
	public void afterScenario()
	{
		System.out.println("*******************Running after scenario************");
	}

	@AfterAll
	public static void afterAll()
	{
		System.out.println("!!!!!!!!!!!!After All!!!!!!!!!!!!!!!");
	}
	
	
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println("-----------------Before Steps--------------");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println("-----------------After Steps--------------");
	}

}
