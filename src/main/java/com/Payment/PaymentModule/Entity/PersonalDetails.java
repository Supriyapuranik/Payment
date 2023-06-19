package com.Payment.PaymentModule.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;

@Entity
@Table(name="Personal_Details")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.CUSTOM)
public class PersonalDetails {
    //Comment
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="dob")
    private String dateOfBirth;

    @Column(name="gender")
    private String gender;

//    @Column(name="address")
//    private String address;

    @Column(name="country")
    private String country;

    public PersonalDetails() {
    }

    public PersonalDetails(int id, String firstName, String lastName, String dateOfBirth, String gender, String country) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.country = country;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    public Address addressDetails()
    {
        Address address=new Address();
        address.setCountry(getCountry());
        return address;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                //", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
