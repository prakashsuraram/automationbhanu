package login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTest {
	WebDriver Driver;
 
  @BeforeClass
  public void browserlaunch() {
	  System.setProperty("webcriver.chrome.driver,","D:\\selenium worksapace by Sridhar\\selenium files\\chromedriver.exe");
	  Driver =new ChromeDriver();
	  Driver.get("http://demo.elixiraid.com/index.php/user/login");
	  Driver.manage().window().maximize();
	  Driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  Driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  Driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  
	  }
  @Test
  public void f() {
	  System.out.println("helo");
  }

}
