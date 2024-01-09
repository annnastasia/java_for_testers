package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactRemovalTests {
  private WebDriver driver;

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    driver.get("http://localhost/addressbook/");
    driver.manage().window().setSize(new Dimension(683, 722));
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
  }

  @AfterEach
  public void tearDown() {
    driver.findElement(By.linkText("Logout")).click();
    driver.quit();
  }

  @Test
  public void canRemoveContact() {
    driver.findElement(By.linkText("home")).click();
    if(!isElementPresent(By.name("selected[]"))){
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
    driver.findElement(By.name("selected[]")).click();
    driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
    driver.findElement(By.linkText("home")).click();
  }

  private boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exeption) {
      return false;
    }

  }
}
