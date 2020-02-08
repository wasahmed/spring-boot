package com.example.accessingdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//jpa entity
// assumed that this entity is mapped to a table named customer
//customer object each annotated as a JPA entity
public class Customer {

    @Id //id property of jpa
    @GeneratedValue(strategy=GenerationType.AUTO)
    //customer attributes
    private Long id;
    private String firstName;
    private String lastName;
    //first name and lastname are unannotated therefore will be mapped to to columns that
    //share the same name as the properties themselves

    //default constructor exists only for the sake of jpa
    // protected because you do not use it directly
    protected Customer() {}

    //constructor that you use to create instances of customer to be saved to the db
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        //prints out customer properties
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}