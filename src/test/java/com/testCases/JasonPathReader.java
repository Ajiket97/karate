package com.testCases;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import com.pojoClass.GoRestUser;
import com.util.SpecificationBuilder;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class JasonPathReader {
	SpecificationBuilder sb = new SpecificationBuilder();

	@Test
	public void readTheJasonPath() {
		String responce = given(sb.requestSB()).when().get().then().extract().asString();
		JsonPath js = new JsonPath(responce);
		String iddd = js.getString("data[0].last_name");
		String email = js.getString("data[0].email");
		System.out.println("nameee----"+iddd+" "+
				
				email);

	}
	@Test
	public void readTheJasonPathSecondWay() {
		given(sb.requestSB())
		.when()
		.get()
		
		.then()
		.assertThat()
		.statusCode(201)
		.body("data[0].last_name", Matchers.equalTo("Bluth"))
		.log().all();
		
	}
}
