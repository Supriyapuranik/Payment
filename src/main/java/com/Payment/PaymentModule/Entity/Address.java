package com.Payment.PaymentModule.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;


@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.CUSTOM)
public class Address {
//    "Country":"String",
//            "State": "String",
//            "city": "String",
//            "Landmark": "String",
//            "address_field1": "string",
//            "address_field2": "string"

    @JsonProperty("Country")
    private String country;

    public String getCountry() {
        return country;
    }
    // private String state;

    public void setCountry(String country) {
       this.country = country;
    }

    public Address() {
    }
//
//    public Address(String country) {
//        this.country = country;
//    }
//private String city;

//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "Country='" + country + '\'' +
//                '}';
//    }
}
