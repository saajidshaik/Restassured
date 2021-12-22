package scripts;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class login extends TestBase{
	
	@Test
	public void register_user( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.post("http://localhost:9090/FlyAway/loginaction?email_id=user2@user.com&pwd=user")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
