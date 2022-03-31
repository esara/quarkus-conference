package org.acme.conference.speaker;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
//@QuarkusTestResource(DerbyDatabaseTestResource.class)
public class SpeakerResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/speaker/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}