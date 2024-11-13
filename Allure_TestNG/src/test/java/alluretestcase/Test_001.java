package alluretestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





public class Test_001 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Method before Print STATEMENT");
		//System.out.println("before every ******Test module 1 test suite1");
	}
	
	@Test
	public void test001() {
		System.out.println("STARTING");
		WebDriver cromedriver= new ChromeDriver();
		String url ="https://www.saucedemo.com/";
		String username = "standard_user";
		String password = "secret_sauce";
		String firstName = "John";
		String lastName = "kennedy";
		String zipCode = "L5P30";
		//System.out.println("i am first 1st module 1 test suite1");
		cromedriver.manage().window().maximize();
		cromedriver.get(url);
		cromedriver.findElement(By.xpath("//*[contains(@name,'user-name')]")).sendKeys(username);
		cromedriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		cromedriver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();	
		
	}
	
	

	

}
