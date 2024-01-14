package tests;

import manager.ApplicationManager;
import model.ContactData;
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

  protected void createContact(ContactData contact) {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(contact.firstname());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(contact.lastname());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys(contact.address());
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys(contact.homephone());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(contact.mobilephone());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(contact.email());
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home page")).click();
  }

  protected void openHomePage() {
    if (!isElementPresent(By.xpath("//input[@value=\'Delete\']"))){
      driver.findElement(By.linkText("home")).click();
    }
  }

  protected boolean isContactPresent() {
    return isElementPresent(By.name("selected[]"));
  }

  protected void removeContact() {
    driver.findElement(By.name("selected[]")).click();
    driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
    driver.findElement(By.linkText("home")).click();
  }
}
