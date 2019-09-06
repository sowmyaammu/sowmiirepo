package case2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class program {
	WebDriver driver;
	@Given("login page is displayed")
	public void login_page_is_displayed() {
		System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@Given("user gives {string}")
	public void user_gives(String string) {
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters {string}")
	public void user_enters(String string) {
driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@And("login page displayed")
	public void login_page_displayed() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	//@Then("home page")
	//public void home_page() {
		//System.out.println("home page");
	//}
}
