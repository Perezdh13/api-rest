package com.example.Api.Rest.services;
import com.example.Api.Rest.interfaces.IVoices;
import com.example.Api.Rest.model.CVoices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CVoicesServices {
    @Autowired
    IVoices iVoices;

    public void createVoices(CVoices voices){
        iVoices.save(voices);
    }


}
