package com.truepush.qa.APITestcases;

import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;


import testbase.TestbaseAPI;

import static io.restassured.RestAssured.*;
public class Listtriggers extends TestbaseAPI {

	
	
	@Test
	
	public void validateTriggersList() {
		
		
		given()
		
		.headers("Content-Type","application/json")
		
		.headers("Authorization",property.getProperty("APIKEY"))		
		
		.when()
		
		.get("https://api.truepush.com/api/v1/listTrigger/1")
		
		.then()
		
		
		.assertThat().statusCode(200)
		
		.assertThat().statusLine("HTTP/1.1 200 OK")
		
	       .assertThat().body("status", equalTo("SUCCESS"))

		.log().all();
		
		
		;
		
	}

	
}
