package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public BaseClass() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver",
					"F:\\Build-Java\\eclipse-java-oxygen-3a-win32\\eclipse\\Amazonprojectworkspace\\AMAZONPROJECT\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
}
