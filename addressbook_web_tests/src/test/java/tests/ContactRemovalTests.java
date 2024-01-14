package tests;

import model.ContactData;
import org.junit.jupiter.api.Test;

public class ContactRemovalTests extends TestBase  {



  @Test
  public void canRemoveContact() {
       if(!app.contacts().isContactPresent()){
      app.contacts().createContact(new ContactData("Last name", "","First name", "","","","Address", "1112222", "89112223344", "", "", "E-mail@mail.com", "", "", "", "", ""));
    }
    app.contacts().removeContact();
  }

}
