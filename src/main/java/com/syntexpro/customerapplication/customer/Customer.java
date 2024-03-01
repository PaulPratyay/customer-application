package com.syntexpro.customerapplication.customer;

public class Customer {

    private final String firstName, lastName, customerID, email;
    private final Integer dateOfBirth;
    private final Long contactNumber;

    public Customer(String firstName, String lastName, String customerID, String email, Integer dateOfBirth, Long contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getEmail() {
        return email;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerID='" + customerID + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
