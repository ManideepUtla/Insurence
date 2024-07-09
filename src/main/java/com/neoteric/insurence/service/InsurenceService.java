package com.neoteric.insurence.service;

import com.neoteric.insurence.model.Insurence;
import com.neoteric.insurence.model.InsurenceForm;

import java.util.UUID;

public class InsurenceService {

    public InsurenceForm getinsurence(Insurence insurence){

        InsurenceForm form =null;

        if (insurence.age>6 && insurence.age<70){

            form=new InsurenceForm();
            form.insurenceName=insurence.insurenceName;
            form.policyNo="Insurencecode"+ UUID.randomUUID().toString();
            form.Price= insurence.price;



        }
        return form;

    }
}
