package com.gorestapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.pojoClass.GoRestUser;

import io.restassured.http.ContentType;

public class WithTokenAPI {
	GoRestUser user = new GoRestUser();

	@Test
	public void verify_GetFunction() {
		given().when().get("https://gorest.co.in/public/v2/users/6940121").then().log().all();
	}
	
	@Test
	public void verify_PostFunction() {
		user.setId(22);
		user.setName("Sam");
		user.setEmail("sam@gmail.com");
		user.setGender("male");
		user.setStatus("Active");
		given().when().body(user).contentType(ContentType.JSON)
				.header("Authorization", "Bearer b19d5a5ac60e6a9743c1dbc7da74305f30a26376629fae869db35e936839d998")
				.when().post("https://gorest.co.in/public/v2/users").then().log().all();
	}
}
