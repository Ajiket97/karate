package com.testCases;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.testng.annotations.Test;

import com.pojoClass.GoRestUser;
import com.util.SpecificationBuilder;

import io.restassured.http.ContentType;

public class DeleteFromGorest {
	@Test
	public void deleteDataGoRest() {
		SpecificationBuilder sb = new SpecificationBuilder();
		GoRestUser user  = new GoRestUser();
		user.setId(55);
		user.setGender("male");
		user.setEmail("aj@125535.com");
		user.setName("ajit");
		user.setStatus("active");
		given(sb.requestSB())
		.body(user)
//.pathParam("id", "6940124")
		.when()
		.post()
		.then()
		.log()
		.all();

	}

}
