package uibank;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllAccountDetails {

	@Test
	public void GetAccountDetails() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api/accounts";

		HashMap<String, String> querySysparams = new HashMap<String, String>();
		querySysparams.put("filter[where][userId]", "620f1e288932d4005f2a887d");

		Response response = RestAssured.given()
				.header("authorization", "NFrBkZKfE9dpLMWC15bAblEWAHcVZ8HjjhR83OvFfiCYj2gVWIytKi99QP7Y95ab")

				.queryParams(querySysparams).get();

		// Print Status code
		System.err.println(response.statusCode());

		// Print response
		response.prettyPrint();

	}

}
