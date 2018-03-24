package new_logics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class inside_Scroll {
	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "browser//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://gromo.github.io/jquery.scrollbar/demo/basic.html");


		//Inside Scroll Bar

		WebElement element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div/div[1]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500); 

		// Scroll Bar normal

		//   ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	}
}


