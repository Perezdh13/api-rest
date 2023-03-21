package com.example.Api.Rest.controller;
import com.example.Api.Rest.services.CVoicesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CVoicesController {
   @Autowired
    CVoicesServices cVoicesServices;


    @GetMapping("/voices")
    public String home(){
       return "home";
    }
}
