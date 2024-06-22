package com.util;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class SpecificationBuilder {
	public static RequestSpecification requestSB() {
		RequestSpecBuilder rsb = new RequestSpecBuilder();
		rsb.setContentType(ContentType.JSON);
		rsb.setBaseUri("https://gorest.co.in/");
		rsb.setBasePath("/public/v2/users/");
		rsb.addHeader("Authorization", "Bearer a5572d9d66755b65c36daa1bd44e8d85a2977c55ab1c49f37a019f8f6b19c690	");
		RequestSpecification rs = rsb.build();
		return rs;
		
	}

}
