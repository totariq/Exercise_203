package com.example.demo;

public class Employee {
    private String firstname;
    private String lastname;
    private String ssn;
    private String dob;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
