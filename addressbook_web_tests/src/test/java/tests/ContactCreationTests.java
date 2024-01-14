package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {


  @Test
  public void canCreateContact() {
    app.contacts().createContact(new ContactData("Last name", "","First name", "", "", "","Address", "1112222", "89112223344", "", "", "E-mail@mail.com", "", "", "", "", ""));
  }

  @Test
  public void canCreateContactWithEmptyFields() {
    app.contacts().createContact(new ContactData());
  }

  @Test
  public void canCreateContactWithNameOnly() {
    app.contacts().createContact(new ContactData().withFieldsFromHP("some last name1", "some first name1", "SPb, Nevsky pr., 1", "333-11-22", "some@email.com"));
  }
}
