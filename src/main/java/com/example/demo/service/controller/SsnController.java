package com.example.demo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SSN;
import com.example.demo.service.SsnService;

@RestController
@RequestMapping("/api/ssn")
public class SsnController {

    @Autowired
    private SsnService ssnService;

    @GetMapping("/{ssn}")
    public ResponseEntity<?> getCityBySsn(@PathVariable String ssn) {
        String ssn1=ssnService.getCityBySsn(ssn);
        return new ResponseEntity<>(ssn1,HttpStatus.OK);
    }
}
    
