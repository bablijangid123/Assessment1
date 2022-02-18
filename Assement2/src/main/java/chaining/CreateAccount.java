package chaining;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CreateAccount extends BaseAPI {

	@Test
	public void createAccount() {

		Response response = RestAssured.given().contentType(ContentType.JSON)
			
				.post();

		System.out.println(response.statusCode());
		response.prettyPrint();

		userId = response.jsonPath().get("userId");

	}
}
