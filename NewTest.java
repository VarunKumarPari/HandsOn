package test_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	static {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pari.varun.kumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
	}
WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() {
	  driver.findElement(By.linkText("Log in")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver.get("http://newtours.demoaut.com");
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("mercury");
	  driver.findElement(By.name("login")).click();
	 

	  

  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }
  
}

