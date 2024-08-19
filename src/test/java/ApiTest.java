import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    private final String baseUri = "https://postman-echo.com";
    private final String defaultBody = "This is expected to be sent back as part of response body.";

    private final RequestSpecification requestSpec = new RequestSpecBuilder()
            .setBaseUri(baseUri)
            .setContentType("text/plain")
            .build();

    private final ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectBody("url", Matchers.containsString(baseUri))
            .expectBody("headers", hasKey("host"))
            .expectBody("args", hasToString("{}"))
            .expectBody("json", nullValue())
            .build();

    private final Requests requests = new Requests(baseUri, requestSpec);

    @Test
    public void testRequest() {
        requests.request()
                .then().log().body().spec(responseSpec);
    }

    @Test
    public void testPostRawText() {
        requests.postRawText(defaultBody)
                .then().log().body().spec(responseSpec).and().body("data", equalTo(defaultBody));
    }

    @Test
    public void testPostFormData() {
        requests.postFormData("foo1", "bar1","foo2", "bar2")
                .then().log().body().spec(responseSpec).and().body("form", hasKey("foo1"));
    }

    @Test
    public void testPut() {
        requests.put(defaultBody)
                .then().log().body().spec(responseSpec).and().body("data", equalTo(defaultBody));
    }

    @Test
    public void testPatch() {
        requests.patch(defaultBody)
                .then().log().body().spec(responseSpec).and().body("data", equalTo(defaultBody));
    }

    @Test
    public void testDelete() {
        requests.delete(defaultBody)
                .then().log().body().spec(responseSpec).and().body("data", equalTo(defaultBody));
    }


}
