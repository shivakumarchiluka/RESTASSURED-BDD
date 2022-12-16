package com.truepush.qa.APITestcases;

import org.testng.annotations.Test;


import testbase.TestbaseAPI;

import static io.restassured.RestAssured.*;





public class Listcampaigns extends TestbaseAPI {
	
	
	
	@Test
	public void validateListCampaignsTest() {
		
		given()
		
		
		.headers("Content-Type","application/json")
		
		.headers("Authorization",property.getProperty("APIKEY"))
		
		.when()
		
		
		.get("https://api.truepush.com/api/v1/listCampaign/1")
		
		
		
		.then()
		
		.log().all()
		
		.assertThat().statusCode(200);
		
		
		
		
	}

}
