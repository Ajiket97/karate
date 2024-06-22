package com.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;




public class TestCase {
	public static void main(String[] args) {
		given().when().get("https://reqres.in/api/users/2").then().log().all();

	}

}
