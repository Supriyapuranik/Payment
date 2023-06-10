package com.Payment.PaymentModule.Repository;

import com.Payment.PaymentModule.Entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Integer>
{
}
