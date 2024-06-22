package com.Test;

import static io.restassured.RestAssured.*;

public class TestCase {
	public static void main(String[] args) {
		given().when().get("https://reqres.in/api/users/2").then().log().all();

	}

}
