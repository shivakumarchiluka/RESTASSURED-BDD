package com.truepush.qa.APITestcases;

import org.testng.annotations.Test;



import io.restassured.http.ContentType;


import testbase.TestbaseAPI;

import static io.restassured.RestAssured.*;


import static org.hamcrest.Matchers.*;

public class PostTemplateBDD extends TestbaseAPI{

	
	@Test
	
	public void validatePostTempalteTest() {
		
		
		given()
		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		.headers("Content-Type","application/json")
		
		.accept(ContentType.JSON)
		
		.contentType(ContentType.JSON)
		
		.body("{\n"
				+ "\"name\": \"Tesla’s mission\",\n"
				+ "\n"
				+ "\"title\":\"Electric Cars, Solar & Clean Energy \",\n"
				+ "\n"
				+ "\"message\": \"Tesla is accelerating the world's transition to sustainable energy with electric cars, solar and integrated renewable energy solutions for homes and businesses\",\n"
				+ "\n"
				+ "\"link\": \"https://www.tesla.com/\",\n"
				+ "\n"
			+ "}")

		.when()
		
		.post("https://app.truepush.com/api/v1/createTemplate")
		
		.then()
		
	       .statusCode(200)
	       
	       .assertThat().body("data", equalTo("TEMPLATE-CREATED-SUCCESSFULLY"))
	     
	       .assertThat().body("status", equalTo("SUCCESS"))
	       
	       
	       .log().all();
	       
		
	       
	    
		
	}
	
}
