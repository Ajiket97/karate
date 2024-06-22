package com.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class APITestCase {

	CreateUser user = new CreateUser();
	
	@Test
	public void verifyAPIGetMethod() {
		given().when().get("https://reqres.in/api/users/2").then().log().all();

	}

	@Test
	public void verifyAPIPostMethod() {
		user.setName("smita");
		user.setJob("QA");
		given().body(user).contentType(ContentType.JSON).when().post("https://reqres.in/api/users").then().log().all();
	}

	@Test
	public void verifyAPIPutMethod() {
		given().body("{\r\n" + "    \"name\": \"smita\",\r\n" + "    \"job\": \"QA\"\r\n" + "}")
				.contentType(ContentType.JSON).when().put("https://reqres.in/api/users/2").then().log().all();
	}
	
	@Test
	public void verifyAPIPatchMethod() {
		given().body("{\r\n" + "    \"name\": \"ajit\",\r\n" + "    \"job\": \"dev\"\r\n" + "}")
				.contentType(ContentType.JSON).when().patch("https://reqres.in/api/users/2").then().log().all();
	}
	
	@Test
	public void verifyAPIDelete() {
		given().when().delete("https://reqres.in/api/users/2").then().log().status();

	}

}
