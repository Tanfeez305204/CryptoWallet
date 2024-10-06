package api;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class FeePage extends BasePage {
    private String endpoint = "/api/v1/transaction_fee";
    
    public Response calculateFee(String currency, double amount) {
        String requestBody = "{ \"currency\": \"" + currency + "\", \"amount\": " + amount + "}";
        return sendPostRequest(endpoint, requestBody);
    }
}
