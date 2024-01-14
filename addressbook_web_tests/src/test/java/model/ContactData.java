package model;

public record ContactData(String lastname, String middlename, String firstname, String nickname, String title, String company, String address, String homephone, String mobilephone, String workphone, String fax, String email, String email2, String email3, String homepage, String byear, String ayear) {

  public ContactData(){
    this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
  }

  public ContactData withName(String lastname, String firstname) {
  return new ContactData(lastname, this.middlename, firstname, this.nickname, this.title, this.company, this.address, this.homephone, this.mobilephone, this.workphone, this.fax, this.email, this.email2, this.email3, this.homepage, this.byear, this.ayear);
  }
  public ContactData withMobileEmail(String lastname, String firstname, String mobilephone, String email) {
    return new ContactData(lastname, this.middlename, firstname, this.nickname, this.title, this.company, this.address, this.homephone, mobilephone, this.workphone, this.fax, email, this.email2, this.email3, this.homepage, this.byear, this.ayear);
  }

  public ContactData withFieldsFromHP(String lastname, String firstname, String address, String homephone, String email) {
    return new ContactData(lastname, this.middlename, firstname, this.nickname, this.title, this.company, address, homephone, this.mobilephone, this.workphone, this.fax, email, this.email2, this.email3, this.homepage, this.byear, this.ayear);
  }
}
