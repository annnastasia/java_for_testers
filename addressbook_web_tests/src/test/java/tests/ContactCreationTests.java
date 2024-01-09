import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactCreationTests {
  private static WebDriver driver;

  @BeforeEach
  public void setUp() {
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


  @Test
  public void canCreateContact() {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("First name");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("Last name");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("Address");
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys("1112222");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("89112223344");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("E-mail@mail.com");
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home page")).click();
  }

  @Test
  public void canCreateContactWithEmptyFields() {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("");
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys("");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("");
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home page")).click();
  }
}
