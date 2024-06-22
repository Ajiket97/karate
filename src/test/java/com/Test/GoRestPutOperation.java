package com.Test;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.pojoClass.GoRestUser;

import io.restassured.http.ContentType;

public class GoRestPutOperation {
	GoRestUser user = new GoRestUser();

	@Test
	public void putOperation() {
		user.setId(99);
		user.setName("Smita Pawar");
		user.setEmail("smitap09@gmail.com");
		user.setGender("female");
		user.setStatus("Active");
		given().body(user).contentType(ContentType.JSON)
				.header("Authorization", "Bearer aa3e47ce245710371582291d4a627ae4c3ef99f18b11f7e2121637864d416c06")
				.when().put("https://gorest.co.in/public/v2/users/6940115").then().log().all();

	}
}
