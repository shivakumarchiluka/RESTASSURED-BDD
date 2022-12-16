package com.truepush.qa.APITestcases;


import static io.restassured.RestAssured.*;




import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import testbase.TestbaseAPI;

public class Listtemplates extends TestbaseAPI{
	
	
	
	@BeforeClass
	
 public void payload() {
		
		
		RestAssured.baseURI = "https://api.truepush.com/api/v1";
		
		RestAssured.basePath = "/listTemplate/1";
		
		
	}
	
	
	@Test
	public void validateListTemplate() {
		
		given()
		
		.headers("Content-Type","application/json")

		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		
		.accept(ContentType.JSON)
		
		.contentType(ContentType.JSON)
		
		
		.when()
		
		.get()
		
		
		.then()
		
		
		.assertThat().statusCode(200)
		
		.log().all();
		
	}

}
