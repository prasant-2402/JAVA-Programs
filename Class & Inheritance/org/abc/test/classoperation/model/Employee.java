package org.abc.test.classoperation.model;

import java.util.Arrays;
import java.util.Iterator;

public class Employee implements Comparable<Employee>, Iterable<Address> {
    private String firstName;
    private String middleName;
    private String lastName;
    private Address[] addresses;

    //Getter Methods
    public String FirstName() {
        return firstName;
    }

    public String MiddleName() {
        return middleName;
    }

    public String LastName() {
        return lastName;
    }

    public Address[] Address() {
        return addresses;
    }

    // Setter Methods
    public void FirstName(String name) {
        firstName = name;
    }

    public void MiddleName(String name) {
        middleName = name;
    }

    public void LastName(String name) {
        lastName = name;
    }

    public void Address(Address[] address) {
        addresses = address;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    @Override
    public int compareTo(Employee o) {
        return this.firstName.compareTo(o.firstName);
    }


    @Override
    public Iterator<Address> iterator() {
        return Arrays.stream(this.addresses).iterator();
    }
}
