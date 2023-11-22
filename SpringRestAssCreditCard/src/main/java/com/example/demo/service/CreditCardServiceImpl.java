package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.exception.InvalidCreditNumberException;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Override
	public String validateCreditCard(String creditCardNumber) {
		int len = creditCardNumber.length();
		for(char c:creditCardNumber.toCharArray()) {
			if(!(c>='0' && c<='9')) {
				throw new InvalidCreditNumberException("Card Number should contains only numbers");
			}
		}
		if(len<15 ) {
			throw new InvalidCreditNumberException("Length of credit card is too less");
		}
		if(len>19 ) {
			throw new InvalidCreditNumberException("Length of credit card is too more");
		}
		
	
		
		throw new InvalidCreditNumberException("Not a Valid Credit card");

	}

}
