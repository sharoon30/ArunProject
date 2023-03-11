package dummyScripts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickOnTest {
	@Test
	public void click() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kalkifashion.com/ethnic/most-loves-styles-on-sale.html");
		driver.findElement(By.xpath("//a[text()='Indo Western' and @class='mega-tab-menu-parent-link']")).click();
		driver.close();
	}

}
