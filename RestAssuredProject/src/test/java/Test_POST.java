import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test_POST {

@Test	
	public void testPut() {
	
	JSONObject request = new JSONObject();
	request.put("name", "Raghav");
	request.put("job", "Teacher");
	
	given().
		header("Content-Type","application/JSON").
		body(request.toJSONString()).
	when().put("https://reqres.in/api/users/2").
	then().statusCode(200);
	
	
		
	}

@Test	
public void testPost() {

JSONObject request = new JSONObject();
request.put("name", "Raghav");
request.put("job", "Teacher");

given().
	header("Content-Type","application/JSON").
	body(request.toJSONString()).
when().post("https://reqres.in/api/users").
then().statusCode(201);


	
}
@Test	
public void testPatch() {

JSONObject request = new JSONObject();
request.put("name", "Raghav");
request.put("job", "Teacher");

given().
	header("Content-Type","application/JSON").
	body(request.toJSONString()).
when().patch("https://reqres.in/api/users").
then().statusCode(200);


	
}
@Test	
public void testDelete() {

JSONObject request = new JSONObject();
request.put("name", "Raghav");
request.put("job", "Teacher");


when().delete("https://reqres.in/api/users/2").
then().statusCode(204);


	
}
}
