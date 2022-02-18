package chaining;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class getAccountDetails extends BaseAPI {

	@Test(dependsOnMethods = "chaining.CreateLogin.ValidateLoginDeatails")
	public void GetAlldetails() {

		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api";

		Response response = RestAssured.given()
				.header("authorization", "NFrBkZKfE9dpLMWC15bAblEWAHcVZ8HjjhR83OvFfiCYj2gVWIytKi99QP7Y95ab")
				.contentType(ContentType.JSON)

				.queryParam("filter[where][userId]", "620f1e288932d4005f2a887d").get("/accounts");

		response.prettyPrint();

		System.out.println(response.statusCode());

	}

}
