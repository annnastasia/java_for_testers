package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactRemovalTests extends TestBase  {



  @Test
  public void canRemoveContact() {
    driver.findElement(By.linkText("home")).click();
    if(!isElementPresent(By.name("selected[]"))){
      createContact("First name", "Last name", "Address", "1112222", "89112223344", "E-mail@mail.com");
    }
    driver.findElement(By.name("selected[]")).click();
    driver.findElement(By.xpath("//input[@value=\'Delete\']")).click();
    driver.findElement(By.linkText("home")).click();
  }

}
