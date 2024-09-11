package API;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pages.SignupPage.testPassword;

public class ApiTests {
    String email = "testingEmailForApi@gmail.com";

    @Test
    public void testGetAllProductsList(){
        String endpoint = "https://automationexercise.com/api/productsList";

        Response response =
                given().
                when().
                        get(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("products"), "Response should contain 'products'");
    }

    // receiving wrong response code
    @Test
    public void testPostToAllProductsList(){
        String endpoint = "https://automationexercise.com/api/productsList";

        Response response =
                given().
                when().
                        post(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(405, response.getStatusCode(), "Expected status code is 405");
        assertTrue(responseBody.contains("This request method is not supported."), "Response should contain 'This request method is not supported'");
    }

    @Test
    public void testGetAllBrandsList(){
        String endpoint = "https://automationexercise.com/api/brandsList";

        Response response =
                given().
                when().
                        get(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("brands"), "Response should contain 'brands'");
    }

    // receiving wrong response code
    @Test
    public void testPutToAllBrandsList(){
        String endpoint = "https://automationexercise.com/api/brandsList";

        Response response =
                given().
                when().
                        put(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(405, response.getStatusCode(), "Expected status code is 405");
        assertTrue(responseBody.contains("This request method is not supported."), "Response should contain 'This request method is not supported.'");
    }

    @Test
    public void testPostToSearchProducts(){
        String endpoint = "https://automationexercise.com/api/searchProduct";

        Response response =
                given().
                        formParam("search_product", "top").
                when().
                        post(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("products"), "Response should contain 'products'");
    }

    // receiving wrong response code
    @Test
    public void testPostToSearchProductsFail(){
        String endpoint = "https://automationexercise.com/api/searchProduct";

        Response response =
                given().
                when().
                        post(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(400, response.getStatusCode(), "Expected status code is 400");
        assertTrue(responseBody.contains("Bad request"), "Response should contain 'Bad request'");
    }

    // Is it possible to run registration scenario from here
    @Test
    public void testPostToVerifyLogin(){
        String endpoint = "https://automationexercise.com/api/verifyLogin";

        Response response =
                given().
                        formParam("email", email).
                        formParam("password", testPassword).
                when().
                        post(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("User exists!"), "Response should contain 'User exists!'");
    }

    // receiving wrong response code
    @Test
    public void testPostToVerifyLoginFail(){
        String endpoint = "https://automationexercise.com/api/verifyLogin";

        Response response =
                given().
                        formParam("password", testPassword).
                when().
                        post(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();

        assertEquals(400, response.getStatusCode(), "Expected status code is 400");
        assertTrue(responseBody.contains("Bad request"), "Response should contain 'Bad request'");
    }

    // receiving wrong response code
    @Test
    public void testDeleteToVerifyLogin(){
        String endpoint = "https://automationexercise.com/api/verifyLogin";

        Response response =
                given().
                when().
                        delete(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        assertEquals(405, response.getStatusCode(), "Expected status code is 405");
        assertTrue(responseBody.contains("This request method is not supported"), "Response should contain 'This request method is not supported'");
    }

    @Test
    public void deleteMethodToDeleteUserAccount(){
        String endpoint = "https://automationexercise.com/api/deleteAccount";

        Response response =
                given().
                        formParam("email", email).
                        formParam("password", testPassword).
                when().
                        delete(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("Account deleted!"), "Response should contain 'Account deleted!'");
    }

    @Test
    public void getUserAccountDetailByEmail(){
        String endpoint = "https://automationexercise.com/api/getUserDetailByEmail";

        Response response =
                given().
                        formParam("email", email).
                when().
                        get(endpoint).
                then().
                        extract().response();

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        assertEquals(200, response.getStatusCode(), "Expected status code is 200");
        assertTrue(responseBody.contains("user"), "Response should contain 'user'");
    }
}
