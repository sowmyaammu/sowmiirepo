package case3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class program2 {
	WebDriver driver;
	@Given("user logins")
	public void user_logins() {
		System.setProperty("webdriver.chrome.driver","C:\\Sowmya\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Given("user clicks the search bar")
	public void user_clicks_the_search_bar() {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
	   	}

	@When("he searches as {string}")
	public void he_searches_as(String string) {
		driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	   
	}

	@Then("he try to find details")
	public void he_try_to_find_details() {
	   driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

}
