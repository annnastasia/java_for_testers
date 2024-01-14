package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase {

  protected static ApplicationManager app;

  @BeforeEach
  public void setUp() {
    if(app == null){
app = new ApplicationManager();
    }
    app.init(System.getProperty("browser", "chrome"));
  }

/*  @BeforeEach
  public void setUp1() {
    if (driver == null) {
      driver = new ChromeDriver();
      Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
      driver.get("http://localhost/addressbook/");
      driver.manage().window().setSize(new Dimension(683, 722));
      driver.findElement(By.name("user")).sendKeys("admin");
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).sendKeys("secret");
      driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
    }

  } */

}
