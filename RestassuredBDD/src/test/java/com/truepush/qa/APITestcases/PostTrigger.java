package com.truepush.qa.APITestcases;

import static io.restassured.RestAssured.*;



import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import testbase.TestbaseAPI;

public class PostTrigger extends TestbaseAPI{
	
	
	HashMap <String, String>map = new HashMap <String, String>();


	@BeforeClass
		
	
	public void setUp() {
		
		map.put("name", "money");	
		
		map.put("templateId", "62e0d13d84c6484e8248c16a");
		
		map.put("type", "multiple");
		
		map.put("sub-type", "daily");
		
		map.put("timings","17:26");
		
		RestAssured.baseURI = "https://app.truepush.com/api/v1";
		
		RestAssured.basePath = "/createTrigger";
		
	}
	
	@Test
	
	public void postTrigger() {
		
		given()
		
		.accept(ContentType.JSON)
		
		
		.headers("Content-Type","application/json")

		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		
		.accept(ContentType.JSON)
		
		.contentType(ContentType.JSON)
		
		.body(map)
		
		
		.when()
		
	            	.post()
		
	            	
		.then()
		
		
		.assertThat().statusCode(200)
	       
	       .log().all().extract().response();
	       		
		
	}
	
	

}
