package scripts;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getFlights extends TestBase{
	
	@Test
	public void Getflights( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.get("http://localhost:9090/FlyAway/home?source=1&destination=3")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
