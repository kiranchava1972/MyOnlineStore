package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() {
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Owner\\Downloads\\selenium downloads dont delete\\Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("http://automationpractice.com/index.php");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Owner\\Downloads\\selenium downloads dont delete\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

	}

	@When("^User Navigate signin register page$")
	public void user_Navigate_signin_register_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("My Store", title);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();

	}

	@When("^User need to email address$")
	public void user_need_to_email_address() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("kiran_chava2003@yahoo.com");
		driver.findElement(By.xpath(
				"//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"))
				.click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Assert.assertEquals("Login - My Store", title1);
		Thread.sleep(1000);

	}

	@Then("^User need to give Personal details & address for Register$")
	public void user_need_to_give_Personal_details_address_for_Register() {
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Kiran babu");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Chava");
		driver.findElement(By.id("email")).sendKeys("kiran_chava2003@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("Kiran123");

	}

	@Then("^message displayed register sucessfully$")
	public void message_displayed_register_sucessfully() {

	}

}
