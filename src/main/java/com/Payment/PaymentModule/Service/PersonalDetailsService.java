package com.Payment.PaymentModule.Service;

import com.Payment.PaymentModule.Entity.PersonalDetails;
import com.Payment.PaymentModule.Repository.PersonalDetailsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PersonalDetailsService {

    @Autowired
    private PersonalDetailsRepository personalRepository;

    public PersonalDetails saveDetail(PersonalDetails personaldetail)
    {
        return personalRepository.save(personaldetail);
    }
    public List<PersonalDetails> saveDetails(List<PersonalDetails> personaldetails)
    {
        return personalRepository.saveAll(personaldetails);
    }
    public PersonalDetails getDetailById(int id)
    {
        return personalRepository.findById(id).orElse(null);
    }
    public List<PersonalDetails> getDetails()
    {
        return personalRepository.findAll();
    }
    public PersonalDetails updateDetails(PersonalDetails details)
    {
        PersonalDetails existingDetails =personalRepository.findById(details.getId()).orElse(null);
        existingDetails.setFirstName(details.getFirstName());
        existingDetails.setLastName(details.getLastName());
        existingDetails.setDateOfBirth(details.getDateOfBirth());
        existingDetails.setGender(details.getGender());
        //existingDetails.setAddress(details.getAddress());
        return personalRepository.save(existingDetails);
    }
    public String deleteDetails(int id)
    {
        personalRepository.deleteById(id);
        return "Personal Details of Number "+ id + " is Deleted";
    }

}
