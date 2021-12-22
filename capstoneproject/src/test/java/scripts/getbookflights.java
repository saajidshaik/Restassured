package scripts;


import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class getbookflights extends TestBase{
	
	@Test
	public void Getflight_details( ) {
		logger.info("Inside POST method");
		RestAssured
			.when()
				.get("http://localhost:9090/FlyAway/bookflight?id=8")
			.then()
				.assertThat()
				.statusCode(200);
			
	}

}
