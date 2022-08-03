package com.truepush.qa.APITestcases;

import org.apache.commons.lang3.RandomStringUtils;

public class PayloadBDD {
	
	
	public static String addTitle() {
			
	String generated =	RandomStringUtils.randomAlphabetic(5);
		
		return (generated);
	}




public static String addMessage() {
		
String generated =	RandomStringUtils.randomAlphabetic(5);
	
	return (generated);
}





public static String addName() {
		
String generated =	RandomStringUtils.randomAlphabetic(5);
	
	return (generated);
}






public static String addEmail() {
		
String generated =	RandomStringUtils.randomAlphabetic(5);
	
	return (generated+"@gmail.com");
}





}

