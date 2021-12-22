package scripts;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class postuser extends TestBase{
	
	@Test
	public void register_user( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.post("http://localhost:9090/FlyAway/signupaction?email_id=user3@user.com&pwd=user&pwd2=user&name=user2&address=&city=")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
