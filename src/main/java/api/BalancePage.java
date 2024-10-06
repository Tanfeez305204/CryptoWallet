package api;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class BalancePage extends BasePage {
    private String endpoint = "/api/v1/balance";
    
    public Response checkBalance(String token) {
        return given()
                   .header("Authorization", "Bearer " + token)
                   .get(baseUrl + endpoint);
    }
}