import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;

public class Requests {

    private String baseUri;
    private final RequestSpecification requestSpec;

    public Requests(String baseUri, RequestSpecification requestSpec) {
        this.baseUri = baseUri;
        this.requestSpec = requestSpec;
    }

    public Response request() {
        return given().spec(requestSpec).when().get("/get");
    }

    public Response postRawText(String body) {
        return given().spec(requestSpec)
                .body(body)
                .when().post("/post");
    }

    public Response postFormData(String k1,String v1, String k2, String v2) {
        return given().spec(requestSpec)
                .contentType("multipart/form-data").multiPart(k1, v1).multiPart(k2, v2)
                .when().post("/post");
    }

    public Response put(String body) {
        return given().spec(requestSpec).body(body)
                .when().put("/put");
    }

    public Response patch(String body) {
        return given().spec(requestSpec).body(body)
                .when().patch("/patch");
    }

    public Response delete(String body) {
        return given().spec(requestSpec).body(body)
                .when().delete("/delete");
    }

}
