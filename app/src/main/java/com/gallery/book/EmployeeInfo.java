package com.gallery.book;

public class EmployeeInfo {

    private String Name;


    private String ContactNumber;


    private String Address;

    public EmployeeInfo() {

    }

    // created getter and setter methods
    // for all our variables.
    public String getUserName() {
        return Name;
    }

    public void setUserName(String Name) {
        this.Name = Name;
    }

    public String getUserContactNumber() {
        return ContactNumber;
    }

    public void setUserContactNumber(String ContactNumber) {
        this.ContactNumber = ContactNumber;
    }

    public String getUserAddress() {
        return Address;
    }

    public void setUserAddress(String Address) {
        this.Address = Address;
    }
}
