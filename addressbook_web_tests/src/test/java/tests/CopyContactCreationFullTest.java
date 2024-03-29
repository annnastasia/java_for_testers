// Generated by Selenium IDE
/*import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class TestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test() {
    driver.get("http://localhost/addressbook/");
    driver.manage().window().setSize(new Dimension(683, 722));
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
    driver.findElement(By.linkText("add new")).click();
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).sendKeys("Aaa");
    driver.findElement(By.name("middlename")).click();
    driver.findElement(By.name("middlename")).sendKeys("Bbb");
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).sendKeys("Ccc");
    driver.findElement(By.name("nickname")).click();
    driver.findElement(By.name("nickname")).sendKeys("Ddd");
    driver.findElement(By.name("photo")).click();
    driver.findElement(By.name("photo")).sendKeys("C:\\fakepath\\photo.jpg");
    driver.findElement(By.name("title")).click();
    driver.findElement(By.name("title")).sendKeys("Eee");
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).sendKeys("Fff");
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).sendKeys("SPb, Mira, 10/17");
    driver.findElement(By.name("home")).click();
    driver.findElement(By.name("home")).sendKeys("1231212");
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).sendKeys("81231234545");
    driver.findElement(By.name("work")).click();
    driver.findElement(By.name("work")).sendKeys("3332222");
    driver.findElement(By.name("fax")).click();
    driver.findElement(By.name("fax")).sendKeys("3332221");
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    {
      WebElement element = driver.findElement(By.name("email"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).sendKeys("mail1@maill.com");
    driver.findElement(By.name("email2")).click();
    driver.findElement(By.name("email2")).sendKeys("mail2@maill.com");
    driver.findElement(By.name("email3")).click();
    driver.findElement(By.name("email3")).sendKeys("mail3@maill.com");
    driver.findElement(By.name("homepage")).click();
    driver.findElement(By.name("homepage")).sendKeys("www.homepage.ru");
    driver.findElement(By.name("bday")).click();
    {
      WebElement dropdown = driver.findElement(By.name("bday"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    driver.findElement(By.name("bmonth")).click();
    {
      WebElement dropdown = driver.findElement(By.name("bmonth"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    driver.findElement(By.name("byear")).click();
    driver.findElement(By.name("byear")).sendKeys("1900");
    driver.findElement(By.name("aday")).click();
    {
      WebElement dropdown = driver.findElement(By.name("aday"));
      dropdown.findElement(By.xpath("//option[. = '1']")).click();
    }
    driver.findElement(By.name("amonth")).click();
    {
      WebElement dropdown = driver.findElement(By.name("amonth"));
      dropdown.findElement(By.xpath("//option[. = 'January']")).click();
    }
    driver.findElement(By.name("ayear")).click();
    driver.findElement(By.name("ayear")).sendKeys("1900");
    driver.findElement(By.name("new_group")).click();
    {
      WebElement dropdown = driver.findElement(By.name("new_group"));
      dropdown.findElement(By.xpath("//option[. = 'njgnkjd fhd']")).click();
    }
    driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    driver.findElement(By.linkText("home")).click();
    driver.findElement(By.linkText("Logout")).click();
  }
}*/
