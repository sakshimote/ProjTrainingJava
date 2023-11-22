package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CreditCardService;

@RestController
@RequestMapping("/api")
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditCardService;
	
	
	@GetMapping("/validate/{cardnumber}")
	public ResponseEntity<String> validateCreditCard(@PathVariable String cardnumber){
		
		return new ResponseEntity<>(creditCardService.validateCreditCard(cardnumber), HttpStatus.OK);
	}
	
	
	
	

}
