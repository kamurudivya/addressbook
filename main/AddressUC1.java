package org.bridgelabz.addressbookworkshop;
/*
 *main code for address book management
 *this file is the gateway for all functions
 */
public class Address {
    private String Fname;
    private String Lname;
    private String city;
    private int zip;
    private String state;
    private long phone;
    private String Email;

    public Address() {
    }
    public String getfname() {
        return Fname;
    }

    public void setfname(String fname) {
        this.Fname = fname;
    }
    public String getlname() {
        return Lname;
    }

    public void setlname(String lname) {
        this.Lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    public long getPhone() {
        return phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getEmail() {
        return Email;
    }


    @Override
    public String toString() {
        return "Address [ fname=" + Fname + " , lname=" + Lname + ", city= " + city  +" , zip = " + zip + " , phone=" + phone +" + Email=" + Email + "]";
    }
}
