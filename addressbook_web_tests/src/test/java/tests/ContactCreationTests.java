package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {


  @Test
  public void canCreateContact() {
    int contactCount = app.contacts().getCount();
    app.contacts().createContact(new ContactData("Last name", "","First name", "", "", "","Address", "1112222", "89112223344", "", "", "E-mail@mail.com", "", "", "", "", ""));
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount + 1, newContactCount);
  }

  @Test
  public void canCreateContactWithEmptyFields() {
    int contactCount = app.contacts().getCount();
    app.contacts().createContact(new ContactData());
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount + 1, newContactCount);
  }

  @Test
  public void canCreateContactWithNameOnly() {
    int contactCount = app.contacts().getCount();
    app.contacts().createContact(new ContactData().withFieldsFromHP("some last name1", "some first name1", "SPb, Nevsky pr., 1", "333-11-22", "some@email.com"));
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount + 1, newContactCount);
  }

  @Test
  public void canCreateMultipleContacts() {
    int n = 2;
    int contactCount = app.contacts().getCount();

    for(int i = 0; i < n; i++) {
      app.contacts().createContact(new ContactData().withFieldsFromHP(randomString((i + 1) * 2), randomString(i * 5), "SPb, Nevsky pr., 1" + i, "333-11-22", randomString((i + 1) * 3) + "@email.com"));
    }


    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount + n, newContactCount);
  }
}
