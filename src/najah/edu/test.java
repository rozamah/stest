package najah.edu;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
class test {
	static WebDriver driver;
	@BeforeClass
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
		driver=new FirefoxDriver();
	}

	@AfterClass
	static void tearDownAfterClass() throws Exception {
	}



	@Test
	void test() {
		//fail("Not yet implemented");
		driver.get("https://ar-ar.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("raya.mah.987@gmail.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("rayaarar123");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}

}
