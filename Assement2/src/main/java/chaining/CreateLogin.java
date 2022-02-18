package chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateLogin extends BaseAPI {

	@Test
	public void ValidateLoginDeatails() {
		// TODO Auto-generated method stub

		Response response = RestAssured.given().contentType(ContentType.JSON).body(new File("./Data/Login.json"))
				.post();

		System.out.println(response.statusCode());
		response.prettyPrint();

		userId = response.jsonPath().get("userId");

	}

}
