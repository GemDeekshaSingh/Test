import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.net.URI;
import java.net.URISyntaxException;

import static io.restassured.RestAssured.given;

public class Test_01 {
    public static void main(String[] args) throws URISyntaxException {
        // GET METHOD
        //URI url=new URI("https://gorest.co.in/public/v2/users");
       //given().contentType(ContentType.JSON).get(url).getBody().prettyPrint();
        //int status=given().contentType(ContentType.JSON).get(url).getStatusCode();
       //System.out.println("status "+status);

        //POST METHOD
//        RestAssured.baseURI="https://reqres.in/";
//        RestAssured.basePath= "api/users";
//        String req="{\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"leader\"\n" +
//                "}";
//
//       given().contentType(ContentType.JSON).header("xyx","xxx/json").
//                and().body(req).post().then().log().all();
//
//        int status=given().contentType(ContentType.JSON).header("xyx","xxx/json").and().body(req).post().getStatusCode();
//        System.out.println(status);

        //PUT METHOD

//        RestAssured.baseURI="https://reqres.in/";
//        RestAssured.basePath= "api/users/2";
//
//        String req=" {\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"zion resident\"\n" +
//                "}";

//        given().contentType(ContentType.JSON).header("sss","www").and().body(req).put().then().log().all();
//
//        int status=given().contentType(ContentType.JSON).header("xxx","cc").and().body(req).put().getStatusCode();
//        System.out.println(status);

        //PATCH METHOD
//        RestAssured.baseURI="https://reqres.in/";
//        RestAssured.basePath= "api/users/2";
//
//        String req=" {\n" +
//                "    \"name\": \"morpheus\",\n" +
//                "    \"job\": \"zion resident\"\n" +
//                "}";
//
//        given().contentType(ContentType.JSON).header("sss","www").and().body(req).patch().then().log().all();
//
//        int status=given().contentType(ContentType.JSON).header("xxx","cc").and().body(req).patch().getStatusCode();
//        System.out.println(status);









    }
}
