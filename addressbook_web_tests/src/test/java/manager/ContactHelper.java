package manager;

import model.ContactData;
import org.openqa.selenium.By;

public class ContactHelper extends HelperBase {

    public ContactHelper (ApplicationManager manager){
    super(manager);
    }

  public void openHomePage() {
    if (!manager.isElementPresent(By.xpath("//input[@value=\'Delete\']"))){
      returnToHomePage();
    }
  }

    public void createContact(ContactData contact) {
    initContactCreation();
    fillContactForm(contact);
    submitContactCreation();
    returnToHomePage();
  }

  public void removeContact() {
    openHomePage();
    selectContact();
    removeSelectedContacts();
    returnToHomePage();
  }

  private void submitContactCreation() {
    click(By.xpath("(//input[@name=\'submit\'])[2]"));
  }

  private void initContactCreation() {
    click(By.linkText("add new"));
  }

  private void returnToHomePage() {
    click(By.linkText("home"));
  }

  private void fillContactForm(ContactData contact) {
    type(By.name("firstname"), contact.firstname());
    type(By.name("middlename"), contact.middlename());
    type(By.name("lastname"), contact.lastname());
    type(By.name("nickname"), contact.nickname());
    type(By.name("title"), contact.title());
    type(By.name("company"), contact.company());
    type(By.name("address"), contact.address());
    type(By.name("home"), contact.homephone());
    type(By.name("mobile"), contact.mobilephone());
    type(By.name("work"), contact.workphone());
    type(By.name("fax"), contact.fax());
    type(By.name("email"), contact.email());
    type(By.name("email2"), contact.email2());
    type(By.name("email3"), contact.email3());
    type(By.name("homepage"), contact.homepage());
    click(By.name("bday"));
    click(By.name("bmonth"));
    type(By.name("byear"), contact.byear());
    click(By.name("aday"));
    click(By.name("amonth"));
    type(By.name("ayear"), contact.ayear());
    click(By.name("new_group"));
  }




  private void removeSelectedContacts() {
    click(By.xpath("//input[@value=\'Delete\']"));
  }

  private void selectContact() {
    click(By.name("selected[]"));
  }


  public int getCount() {
    openHomePage();
    return manager.driver.findElements(By.name("selected[]")).size();
  }

  public void removeAllContacts() {
    openHomePage();
    selectAllContacts();
    removeSelectedContacts();
  }

  private void selectAllContacts() {
    var checkboxes = manager.driver.findElements(By.name("selected[]"));
    for (var checkbox : checkboxes) {
      checkbox.click();
    }
  }
}
