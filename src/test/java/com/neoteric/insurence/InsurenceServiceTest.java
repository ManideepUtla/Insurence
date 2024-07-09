package com.neoteric.insurence;

import com.neoteric.insurence.model.Insurence;
import com.neoteric.insurence.model.InsurenceForm;
import com.neoteric.insurence.service.InsurenceService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsurenceServiceTest {

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
        Assertions.assertNotNull(form.insurenceName);



    }
    @Test
    public void insurenceTestNeg(){
        Insurence insurence= new Insurence();
        insurence.firstName="Manideep";
        insurence.lastName="Utla";
        insurence.age=89;
        insurence.mobileNo="9985533134";
        insurence.dateOfBirth="30-10-2002";
        insurence.city="Rajahmundry";
        insurence.insurenceName="HealthInsurence";
        insurence.price=10000;


        InsurenceService service=new InsurenceService();
        service.getinsurence(insurence);

        InsurenceForm form=service.getinsurence(insurence);
        //Assertions.assertEquals(10000,insurence.price);
        Assertions.assertNull(form);



    }

}