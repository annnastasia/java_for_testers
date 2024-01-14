package manager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import tests.TestBase;

public class ApplicationManager {
  protected WebDriver driver;

  private LoginHelper session;
  private GroupHelper groups;

  public void init(String browser) {
    if (driver == null) {
      if("firefox".equals(browser)) {
        driver = new FirefoxDriver();
      } else if("chrome".equals(browser)){
          driver = new ChromeDriver();
        } else if("IE".equals(browser)){
        driver = new InternetExplorerDriver();
      } else {
        throw new IllegalArgumentException(String.format("Unknown browser %s", browser));
      }
      Runtime.getRuntime().addShutdownHook(new Thread(driver::quit));
      driver.get("http://localhost/addressbook/");
      driver.manage().window().setSize(new Dimension(683, 722));
      session().login("admin", "secret");
    }
  }

  public LoginHelper session () {
    if(session == null){
      session = new LoginHelper(this);
    }
    return session;
  }

  public GroupHelper groups(){
          if(groups == null){
            groups = new GroupHelper(this);
          }
          return groups;
  }

  protected boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException exception) {
      return false;
    }

  }


  public void createContact(ContactData contact) {
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys(contact.firstname());
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).sendKeys(contact.middlename());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys(contact.lastname());
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).sendKeys(contact.nickname());
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).sendKeys(contact.title());
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys(contact.company());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys(contact.address());
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys(contact.homephone());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys(contact.mobilephone());
    driver.findElement(By.name("work")).click();
    driver.findElement(By.name("work")).sendKeys(contact.workphone());
    driver.findElement(By.name("fax")).click();
    driver.findElement(By.name("fax")).sendKeys(contact.fax());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys(contact.email());
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).sendKeys(contact.email2());
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).sendKeys(contact.email3());
    driver.findElement(By.name("homepage")).click();
    driver.findElement(By.name("homepage")).sendKeys(contact.homepage());
    driver.findElement(By.name("bday")).click();
    driver.findElement(By.name("bmonth")).click();
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).sendKeys(contact.byear());
    driver.findElement(By.name("aday")).click();
    driver.findElement(By.name("amonth")).click();
    driver.findElement(By.name("ayear")).click();
    driver.findElement(By.name("ayear")).sendKeys(contact.ayear());
    driver.findElement(By.name("new_group")).click();
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home page")).click();
  }

  public void openHomePage() {
    if (!isElementPresent(By.xpath("//input[@value=\'Delete\']"))){
      driver.findElement(By.linkText("home")).click();
    }
  }

  public boolean isContactPresent() {
    return isElementPresent(By.name("selected[]"));
  }

  public void removeContact() {
    driver.findElement(By.name("selected[]")).click();
    driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
    driver.findElement(By.linkText("home")).click();
  }
}

