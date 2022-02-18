package uibank;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateLogin {

	@Test
	public void ValidateLoginDeatails() {
		// TODO Auto-generated method stub
	
		// Endpoint for Get All Incidents
		RestAssured.baseURI="https://uibank-api.azurewebsites.net/api/users/login";
		
		 Response response = RestAssured.given()
		.header("authorization", "NFrBkZKfE9dpLMWC15bAblEWAHcVZ8HjjhR83OvFfiCYj2gVWIytKi99QP7Y95ab")
		 
		.contentType(ContentType.JSON)
		 .body(new File("./Data/Login.json"))
		 .post();
		
		//Print Status code
		System.err.println(response.statusCode());
		
		//Print response
		response.prettyPrint();
		
		
		

	}

}
