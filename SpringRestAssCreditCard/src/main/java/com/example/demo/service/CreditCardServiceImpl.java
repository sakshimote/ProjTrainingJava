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
		if(len==15) {
			int x = (creditCardNumber.charAt(0)-'0')*1000 + (creditCardNumber.charAt(1)-'0')*100 + (creditCardNumber.charAt(2)-'0')*10 + (creditCardNumber.charAt(3)-'0');
			if(x==2014 || x== 2149) {
				return "enRoute";
			}
		}
		if(len>=16 && len <=19) {
			if(creditCardNumber.charAt(0)=='4') {
				return "visa";
			}
			int x = (creditCardNumber.charAt(0)-'0')*1000 + (creditCardNumber.charAt(1)-'0')*100 + (creditCardNumber.charAt(2)-'0')*10 + (creditCardNumber.charAt(3)-'0');
			if(x>=3528 && x<3589) {
				return "JCB";
			}
			System.out.println(x);
			x=(x*10) + (creditCardNumber.charAt(4)-'0');
			x=(x*10) + (creditCardNumber.charAt(5)-'0');
			System.out.println(x);
			if((x>=601100 && x<=601109)||(x>=601120 && x<=601149)||(x>=601177 && x<=601179)||(x>=601186 && x<=601199)||(x>=604000 && x<=659999) || x==601174) {
				return "Discover";
			}
			if((creditCardNumber.charAt(0)=='5' && (creditCardNumber.charAt(1)>='1' && creditCardNumber.charAt(1)<='5')) && (x>=510000 && x<559999)) {
				return "Mastercard";
			}
			if((creditCardNumber.charAt(0)=='2' && (creditCardNumber.charAt(1)>='2' && creditCardNumber.charAt(1)<='7')) && (x>=222100 && x<272099)) {
				return "Mastercard";
			}
		}
		
		throw new InvalidCreditNumberException("Not a Valid Credit card");

	}

}
