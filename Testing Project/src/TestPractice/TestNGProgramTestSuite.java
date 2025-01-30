package TestPractice;

import org.testng.annotations.Test;

public class TestNGProgramTestSuite 
{
	@Test(priority = 1)
    public void TC1() {
        System.out.println("Test: 1");
    }

    @Test(priority = 2)
    public void TC2() {
        System.out.println("Test: 2");
    }

    @Test(priority = 3)
    public void TC3() {
        System.out.println("Test: 3");
    }
    
    @Test
    public void TC4() {
        System.out.println("Test: 4");
    }
    
    @Test(priority=-2)
    public void TC5() {
        System.out.println("Test: 5");
    }
    

}
