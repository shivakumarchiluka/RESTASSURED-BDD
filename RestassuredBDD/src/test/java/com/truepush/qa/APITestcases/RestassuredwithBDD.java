package com.truepush.qa.APITestcases;


import java.util.HashMap;





import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import testbase.TestbaseAPI;

import static io.restassured.RestAssured.*;


import static org.hamcrest.Matchers.*;
public class RestassuredwithBDD extends TestbaseAPI{
	
	public static HashMap<String, String> hash = new HashMap<String, String>();
	
	@BeforeClass
	
	public void payloadData() {

		
		hash.put("title", PayloadBDD.addTitle());
		
		hash.put("message", PayloadBDD.addMessage());
		
		hash.put("link", "https://www.amazon.com/");
		
		hash.put("image", "https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back04.jpg");
		
		hash.put("icon", "https://commondatastorage.googleapis.com/codeskulptor-assets/week8-dart.png");
		
		RestAssured.baseURI = "https://app.truepush.com/api/v1";
		
		RestAssured.basePath = "/createCampaign";
		
	}
	
	@Test
	
	public void validateSimpleCampaign() {
		
		given()
		
		
		///.contentType("application/json")

		
		.headers("Content-Type","application/json")

		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		
		.accept(ContentType.JSON)
		
		.contentType(ContentType.JSON)
		
		.body(hash)
		
		
		.when()
		
	            	.post()
		
	            	
		.then()
		
		
		.assertThat().statusCode(200)
	       
	       .log().all().extract().response();
	       
		
	}

}
