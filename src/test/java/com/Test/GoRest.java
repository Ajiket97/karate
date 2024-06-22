package com.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

import com.pojoClass.GoRestUser;

import io.restassured.http.ContentType;

public class GoRest {
	GoRestUser Gouser = new GoRestUser();

	@Test
	public void postOperationGoRest() {
		Gouser.setId(55);
		Gouser.setName("Ajit");
		Gouser.setStatus("active");
		Gouser.setGender("male");
		Gouser.setEmail("ajit123@gmail.com");
		given().body(Gouser).contentType(ContentType.JSON)
				.header("Authorization", "Bearer aa3e47ce245710371582291d4a627ae4c3ef99f18b11f7e2121637864d416c06")
				.when().post("https://gorest.co.in/public/v2/users").then().log().all();
	}
}
