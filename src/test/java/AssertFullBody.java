import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

public class AssertFullBody {
    public static void main(String[] args) throws URISyntaxException {
        RestAssured.baseURI="https://reqres.in/";
        RestAssured.basePath="api/users";
        URI url=new URI("https://reqres.in/api/users");

        given()
                .contentType(ContentType.JSON)
                .get()
                .then()
                .assertThat()
                .body(containsString("Morris"))
                .log().all();

    }
}
