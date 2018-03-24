package westpac_pac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class basicCommnads {

	WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver","Browser//chromedriver1.exe");
		driver = new ChromeDriver();

		driver.get("file:///C:/Users/Welcome/Downloads/Final.html");

		driver.manage().window().maximize();
		driver.navigate().refresh();

		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("selenium data");

		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.chord(Keys.CONTROL+"a"),"Kiran Polapally");


		//this will also works
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(Keys.chord(Keys.CONTROL,"a"),"Kiran Polapally");


		driver.findElement(By.xpath("")).click();

		WebElement wb = driver.findElement(By.xpath(""));
		wb.click();
		wb.clear();


		Select s = new Select(driver.findElement(By.xpath("")));
		s.selectByIndex(2);
		s.selectByValue("");
		s.selectByVisibleText("");


		String m = s.getFirstSelectedOption().getText();      // to pick the first selected option
		System.out.println(m);


	}

}
