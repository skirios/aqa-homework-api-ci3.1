import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
    @Test
    void trainingTestPostmanEcho() {

        given()
                .baseUri("https://postman-echo.com")
                .body("mani padme hum")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("om mani padme hum"))
        ;

    }
}
