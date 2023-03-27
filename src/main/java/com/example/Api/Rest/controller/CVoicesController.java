package com.example.Api.Rest.controller;

import com.example.Api.Rest.model.CVoice;
import com.example.Api.Rest.services.CVoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/voices")
@CrossOrigin("*")
public class CVoicesController {
    @Autowired
    CVoiceService cVoiceService;

    @GetMapping()
    public ArrayList<CVoice> getVoices() {
        return cVoiceService.getVoices();
    }

    @PostMapping()
    public CVoice saveVoice(@RequestBody CVoice voiceModel) {
        return cVoiceService.saveVoice(voiceModel);
    }

    @GetMapping(path = "/{id}")
    public Optional<CVoice> getVoiceBy(@PathVariable Long id) {
        return cVoiceService.getVoiceById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteVoice(@PathVariable Long id) {
        return cVoiceService.deleteUserById(id);
    }

}
