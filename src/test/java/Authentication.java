import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Authentication {

    @Test
    public void getData() {
        RequestSpecification httpRequest = RestAssured.given();
        Response res = httpRequest.get("https://reqres.in/");
        ResponseBody body = res.body();
        //Converting the response body to string
        String req   = body.asString();
        System.out.println("Data from the GET API- "+req);
    }
}


