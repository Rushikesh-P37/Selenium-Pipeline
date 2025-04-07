package MavenForJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UITest {

	@Test
	public void StartBrowser() {
		// WebDriverManager.chromedriver().setup();
		String path = "C:\\Users\\kingr\\eclipse-workspace\\MavenProject\\Drivers";
		System.setProperty("webdriver.chrome.driver", path + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Human Resources Management Software | OrangeHRM HR Software";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		// Assert.assertTrue(driver.getTitle().contains("Human Resources Management
		// Software | OrangeHRM"), "Title does not match");
		driver.quit();
	}

}
