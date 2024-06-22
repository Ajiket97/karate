package com.reqresapi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.Test.CreateUser;

import io.restassured.http.ContentType;

public class WithOutToken {
	CreateUser user = new CreateUser();

	@Test
	public void verify_WithoutToken_GetFunction() {
		given().when().get("https://reqres.in/api/users/2").then().log().all();
	}

	@Test
	public void verify_WithoutToken_PutFunction() {
		user.setName("Ajit");
		user.setJob("BCA Corrspondant Assistant");
		given().when().contentType(ContentType.JSON).body(user).put("https://reqres.in/api/users/2").then().log().all();
	}

}
