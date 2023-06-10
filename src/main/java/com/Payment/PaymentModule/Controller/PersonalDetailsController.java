package com.Payment.PaymentModule.Controller;

import com.Payment.PaymentModule.Entity.PersonalDetails;
import com.Payment.PaymentModule.Service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonalDetailsController {

    @Autowired
    private PersonalDetailsService personalDetailsService;

    @PostMapping("/addDetail")
    public PersonalDetails addDetail(@RequestBody PersonalDetails detail)
    {
        return personalDetailsService.saveDetail(detail);
    }

    @PostMapping("/addDetails")
    public List<PersonalDetails> addDetails(@RequestBody List<PersonalDetails> details)
    {
        return personalDetailsService.saveDetails(details);
    }

    @GetMapping("/getDetails")
    public List<PersonalDetails> getDetails()
    {
        return personalDetailsService.getDetails();
    }

    @GetMapping("/getDetailsById/{id}")
    public PersonalDetails getDetailsById(@PathVariable int id)
    {
        return personalDetailsService.getDetailById(id);
    }

    @PutMapping("/updateDetails")
    public PersonalDetails updateDetails(@RequestBody PersonalDetails updatedetails)
    {
        return personalDetailsService.updateDetails(updatedetails);
    }

    @DeleteMapping("/deleteDetails/{id}")
    public String deleteDetails(@PathVariable int id)
    {
        return personalDetailsService.deleteDetails(id);
    }
}
