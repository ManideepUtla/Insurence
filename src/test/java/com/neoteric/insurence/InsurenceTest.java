package com.neoteric.insurence;

import com.neoteric.insurence.model.Insurence;
import com.neoteric.insurence.model.InsurenceForm;
import com.neoteric.insurence.service.InsurenceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsurenceTest {

    @Test

    public void insurenceTest(){
        Insurence insurence= new Insurence();
        insurence.firstName="Manideep";
        insurence.lastName="Utla";
        insurence.age=22;
        insurence.mobileNo="9985533134";
        insurence.dateOfBirth="30-10-2002";
        insurence.city="Rajahmundry";
        insurence.insurenceName="HealthInsurence";
        insurence.price=10000;


        InsurenceService service=new InsurenceService();
        service.getinsurence(insurence);

        InsurenceForm form=service.getinsurence(insurence);
        Assertions.assertEquals(10000,insurence.price);
        Assertions.assertNotNull(insurence.insurenceName);



    }
}
