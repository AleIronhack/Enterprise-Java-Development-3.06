package com.example.lab306.models2;

import javax.persistence.*;

@Embeddable
public class Name {

    private String firstName;
    private String lastName;
    private Salutation salutation;

    public Name() {
    }

    public Name(String firstName, String lastName, Salutation salutation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }
}
