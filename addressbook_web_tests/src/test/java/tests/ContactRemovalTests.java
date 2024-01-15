package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase {


  @Test
  public void canRemoveContact() {
    if (app.contacts().getCount() == 0) {
      app.contacts().createContact(new ContactData("Last name", "", "First name", "", "", "", "Address", "1112222", "89112223344", "", "", "E-mail@mail.com", "", "", "", "", ""));
    }
    int contactCount = app.contacts().getCount();
    app.contacts().removeContact();
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount - 1, newContactCount);
  }

  @Test
  void canRemoveAllContactsAtOnce() {
    if (app.contacts().getCount() == 0) {
      app.contacts().createContact(new ContactData("Last name", "", "First name", "", "", "", "Address", "1112222", "89112223344", "", "", "E-mail@mail.com", "", "", "", "", ""));
    }
    app.contacts().removeAllContacts();
    Assertions.assertEquals(0, app.contacts().getCount());
  }

}
