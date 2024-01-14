package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper {

  private final ApplicationManager manager;

  public ContactHelper (ApplicationManager manager){
    this.manager = manager;
  }

  public void openHomePage() {
    if (!manager.isElementPresent(By.xpath("//input[@value=\'Delete\']"))){
      manager.driver.findElement(By.linkText("home")).click();
    }
  }

  public boolean isContactPresent() {
    return manager.isElementPresent(By.name("selected[]"));
  }

  public void createContact(ContactData contact) {
    manager.driver.findElement(By.linkText("add new")).click();
    manager.driver.findElement(By.name("firstname")).click();
    manager.driver.findElement(By.name("firstname")).sendKeys(contact.firstname());
    manager.driver.findElement(By.name("middlename")).click();
    manager.driver.findElement(By.name("middlename")).sendKeys(contact.middlename());
    manager.driver.findElement(By.name("lastname")).click();
    manager.driver.findElement(By.name("lastname")).sendKeys(contact.lastname());
    manager.driver.findElement(By.name("nickname")).click();
    manager.driver.findElement(By.name("nickname")).sendKeys(contact.nickname());
    manager.driver.findElement(By.name("title")).click();
    manager.driver.findElement(By.name("title")).sendKeys(contact.title());
    manager.driver.findElement(By.name("company")).click();
    manager.driver.findElement(By.name("company")).sendKeys(contact.company());
    manager.driver.findElement(By.name("address")).click();
    manager.driver.findElement(By.name("address")).sendKeys(contact.address());
    manager.driver.findElement(By.name("home")).click();
    manager.driver.findElement(By.name("home")).sendKeys(contact.homephone());
    manager.driver.findElement(By.name("mobile")).click();
    manager.driver.findElement(By.name("mobile")).sendKeys(contact.mobilephone());
    manager.driver.findElement(By.name("work")).click();
    manager.driver.findElement(By.name("work")).sendKeys(contact.workphone());
    manager.driver.findElement(By.name("fax")).click();
    manager.driver.findElement(By.name("fax")).sendKeys(contact.fax());
    manager.driver.findElement(By.name("email")).click();
    manager.driver.findElement(By.name("email")).sendKeys(contact.email());
    manager.driver.findElement(By.name("email2")).click();
    manager.driver.findElement(By.name("email2")).sendKeys(contact.email2());
    manager.driver.findElement(By.name("email3")).click();
    manager.driver.findElement(By.name("email3")).sendKeys(contact.email3());
    manager.driver.findElement(By.name("homepage")).click();
    manager.driver.findElement(By.name("homepage")).sendKeys(contact.homepage());
    manager.driver.findElement(By.name("bday")).click();
    manager.driver.findElement(By.name("bmonth")).click();
    manager.driver.findElement(By.name("byear")).click();
    manager.driver.findElement(By.name("byear")).sendKeys(contact.byear());
    manager.driver.findElement(By.name("aday")).click();
    manager.driver.findElement(By.name("amonth")).click();
    manager.driver.findElement(By.name("ayear")).click();
    manager.driver.findElement(By.name("ayear")).sendKeys(contact.ayear());
    manager.driver.findElement(By.name("new_group")).click();
    manager.driver.findElement(By.xpath("(//input[@name=\'submit\'])[2]")).click();
    manager.driver.findElement(By.linkText("home page")).click();
  }

  public void removeContact() {
    openHomePage();
    manager.driver.findElement(By.name("selected[]")).click();
    manager.driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
    manager.driver.findElement(By.linkText("home")).click();
  }
}
