package com.teamd.teamdbackendapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.teamd.teamdbackendapi.model.Certification;
import com.teamd.teamdbackendapi.repository.CertificationRepository;



@RestController
public class CertificationController {
    @Autowired
    private CertificationRepository certificationRepository;

    @PostMapping("/PCertification")
    Certification newCertification(@RequestBody Certification newCertification){
        return certificationRepository.save(newCertification);
    }

    @GetMapping("/GCertification")
    List<Certification>getAllCertifications(){
        return certificationRepository.findAll();
    }
}
