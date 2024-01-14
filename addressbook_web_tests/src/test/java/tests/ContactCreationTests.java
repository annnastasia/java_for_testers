package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {


  @Test
  public void canCreateContact() {
    createContact(new ContactData("Last name", "First name", "Address", "1112222", "89112223344", "E-mail@mail.com"));
  }

  @Test
  public void canCreateContactWithEmptyFields() {

    createContact(new ContactData("", "", "", "", "", ""));
  }
}
