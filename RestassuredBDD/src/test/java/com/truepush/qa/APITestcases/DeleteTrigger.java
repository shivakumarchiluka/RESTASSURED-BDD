package com.truepush.qa.APITestcases;

import static io.restassured.RestAssured.*;



import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import io.restassured.response.Response;


import testbase.TestbaseAPI;

public class DeleteTrigger  extends TestbaseAPI{
	
	
	
	@Test
	
	
	public void deleteTrigger() {
	
		
		Response response =
		
		given()
		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		.headers("Content-Type","application/json")
		
		.accept(ContentType.JSON)		
		
		.contentType(ContentType.JSON)
		
		.when()
		
		.delete("https://app.truepush.com/​api/v1​/deleteTrigger/62d4f1df10d2098cf26a1910")
		
		.then()
		
		.log().all()
		
		.extract().response();
		
	String resp =	response.asString();
	
	Assert.assertEquals(resp.contains("TRIGGER-DELETED-SUCCESSFULLY"), true);
		
		
	}

}
