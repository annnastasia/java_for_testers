package tests;

import manager.ApplicationManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

  protected static ApplicationManager app;
  protected static WebDriver driver;

  @BeforeEach
  public void setUp() {
    if(app == null){
app = new ApplicationManager();
    }
    app.init(System.getProperty("browser", "chrome"));
  }

  @BeforeEach
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

  }

  protected boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exeption) {
      return false;
    }

  }

  protected void createContact(String First_name, String Last_name, String Address, String x, String x1, String x2) {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(First_name);
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(Last_name);
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys(Address);
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys(x);
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(x1);
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(x2);
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home page")).click();
  }
}
