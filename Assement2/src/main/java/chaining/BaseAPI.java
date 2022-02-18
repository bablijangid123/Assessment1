package chaining;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;

public class BaseAPI {

	public static String userId = "";

	// 620f1e288932d4005f2a887d
	@BeforeTest
	public void getinit() {
		RestAssured.baseURI = "https://uibank-api.azurewebsites.net/api";
	}

}
