import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Examples {
	
	/*@Test
	void test_01() {
		
		baseURI = "http://localhost:3000";
		given().
			get("/users").then().statusCode(200).log().all();
		
	}

	@Test
	void test_02() {
		
		baseURI = "http://localhost:3000";
		given().param("name", "Automation").
			get("/subjects").then().statusCode(200).log().all();
		
	}*/
	/*
	@Test
	void testPost() {
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		request.put("firstName", "Sara");
		request.put("lastName", "Thomas");
		request.put("subjectId", 2);
		request.put("id", 2);
		
		given().contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().post("/users").
		then().statusCode(201).log().all();
		
	}*/
	/*
	@Test
	void testPut() {
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		request.put("firstName", "Sarah");
		request.put("lastName", "Thomaskutty");
		request.put("subjectId", 2);
		request.put("id", 2);
		
		given().contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().put("/users/2").
		then().statusCode(200).log().all();
		
	}
	*/
	
	@Test
	void testPatch() {
		baseURI = "http://localhost:3000";
		JSONObject request = new JSONObject();
		request.put("firstName", "Sairah");
		
		
		given().contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().patch("/users/2").
		then().statusCode(200).log().all();
		
	}
	
	/*
	@Test
	void testDelete() {
		baseURI = "http://localhost:3000";
		
		given().delete("users/4").
		then().statusCode(200).log().all();
		
	}*/
}
