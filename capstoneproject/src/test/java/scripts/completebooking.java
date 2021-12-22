package scripts;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class completebooking extends TestBase{
	
	@Test
	public void complete_booking( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.get("http://localhost:9090/FlyAway/completepurchase")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
