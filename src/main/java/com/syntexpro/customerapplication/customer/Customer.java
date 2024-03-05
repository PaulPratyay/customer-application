package com.syntexpro.customerapplication.customer;

import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )

    private Integer customerId;
    private String firstName;
    private String lastName;

    private String email;
    private String dateOfBirth;
    private Long contactNumber;

    public Customer() {
    }

    public Customer(String firstName, String lastName, Integer customerID, String email, String dateOfBirth, Long contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerID;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactNumber = contactNumber;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getCustomerID() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
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
                ", customerID='" + customerId + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
