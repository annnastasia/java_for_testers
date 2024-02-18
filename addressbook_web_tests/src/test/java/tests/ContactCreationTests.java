package tests;

import model.ContactData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

public class ContactCreationTests extends TestBase {


  public static List<ContactData> contactProvider() {
    var result = new ArrayList<ContactData>();
    for (var lastname : List.of("", "Some last name")){
        for (var firstname : List.of("", "Some first name")) {
          for (var mobilephone : List.of("", "987-654-32-10")) {
            for(var email : List.of("", "some@email.com")){
              result.add(new ContactData().withMobileEmail(lastname, firstname, mobilephone, email));
            }
          }
        }
    }
    for(int i = 0; i < 5; i++) {
     result.add(new ContactData().withFieldsFromHP(randomString(i * 2), randomString(i * 2), randomString((i + 1) * 3) + ", " + randomString((i + 1) * 3) + " street, " + randomZifra(i + 1), randomZifra(7), randomString((i + 1) * 3) + "@email.com"));
    }
    return result;
  }


  @ParameterizedTest
  @MethodSource("contactProvider")
  public void canCreateMultipleContacts(ContactData contact) {
    int contactCount = app.contacts().getCount();
    app.contacts().createContact(contact);
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount + 1, newContactCount);
  }

  public static List<ContactData> negativeContactProvider() {
    var result = new ArrayList<ContactData>(List.of(
            new ContactData( "Some last name'", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "")));
    return result;
  }

  @ParameterizedTest
  @MethodSource("negativeContactProvider")
  public void canNotCreateContact(ContactData contact) {
    int contactCount = app.contacts().getCount();
    app.contacts().createContact(contact);
    int newContactCount = app.contacts().getCount();
    Assertions.assertEquals(contactCount, newContactCount);
  }
}


