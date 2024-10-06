package api;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;

public class TransactionPage extends BasePage {
    private String transactionEndpoint = "/api/v1/transactions";

    public Response transferCrypto(String token, String toAddress, double amount) {
        String requestBody = "{ \"to\": \"" + toAddress + "\", \"amount\": " + amount + "}";
        return given()
                   .header("Authorization", "Bearer " + token)
                   .body(requestBody)
                   .post(baseUrl + transactionEndpoint);
    }
}
