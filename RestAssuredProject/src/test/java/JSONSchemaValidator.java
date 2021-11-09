import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class JSONSchemaValidator {

	@Test
	void test_01() {
		
	baseURI = "https://reqres.in/api";
	given().
	get("/users").
	then().assertThat().
	body(matchesJsonSchemaInClasspath("schema.json"));

	}

	
}
