import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

public class apiTest {


    @Test
    public void testRequest() {
        given().baseUri("https://postman-echo.com")
                .when().get("/get")
                .then().log().body().statusCode(200).and().body("url",
                        equalTo("http://postman-echo.com/get"));

    }

    @Test
    public void testPostRawText() {
        given().baseUri("https://postman-echo.com")
                .contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().post("/post")
                .then().log().body().statusCode(200).and().body("data",
                        equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testPostFormData() {
        given().baseUri("https://postman-echo.com")
                .contentType("multipart/form-data").multiPart("foo1", "bar1").multiPart("foo2", "bar2")
                .when().post("/post")
                .then().log().body().statusCode(200).and().body("form",
                        not(""));
    }

    @Test
    public void testPut() {
        given().baseUri("https://postman-echo.com")
                .contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().put("/put")
                .then().log().body().statusCode(200).and().body("data",
                        equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testPatch() {
        given().baseUri("https://postman-echo.com")
                .contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().patch("/patch")
                .then().log().body().statusCode(200).and().body("data",
                        equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void testDelete() {
        given().baseUri("https://postman-echo.com")
                .contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().delete("/delete")
                .then().log().body().statusCode(200).and().body("data",
                        equalTo("This is expected to be sent back as part of response body."));
    }




}
