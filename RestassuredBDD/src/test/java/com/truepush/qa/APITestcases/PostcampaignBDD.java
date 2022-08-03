package com.truepush.qa.APITestcases;

import static io.restassured.RestAssured.*;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import io.restassured.response.Response;

import junit.framework.Assert;

import testbase.TestbaseAPI;

public class PostcampaignBDD extends TestbaseAPI{

	
	@Test
	
	public void validatePostCampaign() {
		
		
		Response response = 
		
		given()
		
		
//		.params("title", "digital india")
		
		.headers("Content-Type","application/json")

		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		
		.accept(ContentType.JSON)
		
	//	.contentType(ContentType.JSON)
		
		.body("{\n"
				+ "\"title\":\"makemytrip\",\n"
				+ "\"message\": \"book your flight tickets\",\n"
				+ "\"link\": \"https://www.makemytrip.com/\",\n"
				+"\"image\":\"https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back05.jpg\",\n"
				+"\"icon\":\"https://codeskulptor-demos.commondatastorage.googleapis.com/GalaxyInvaders/back07.jpg\",\n"
				+ "\"scheduled\" : false,\n"
				+ "\"campaignExpiryTime\" : 20,\n"
				+ "\"timings\":\n"
				+ "{\n"
				+ "\"date\": \"21-02-2022\",\n"
				+ "\"time\": \"16:03\"\n"
				+ "}\n"
				+ "	\n"
				+ "}")
		
		.when()
		
		     .post("https://app.truepush.com/api/v1/createCampaign")
		     
		     
		.then()
		      
		//validations
		
		       .statusCode(200)
		       
		       .assertThat().body("data", equalTo("CAMPAIGN-CREATED-SUCCESSFULLY"))
		       
		       
		       
		  //     .body("name", hasItems("")) for validating multiple contents
		       
		       .header("server","nginx/1.16.1")
		       
		       .log().all()
		       
		       .extract().response();
		       
		     String jsonstring =  response.asString();
		     
		     Assert.assertEquals(jsonstring.contains("CAMPAIGN-CREATED-SUCCESSFULLY"),true);
		       
		
	}
}
