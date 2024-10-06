package api;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ExchangeRate extends BasePage {
    private String endpoint = "/api/v1/exchange_rates";
    
    public Response getExchangeRates() {
        return sendGetRequest(endpoint);
    }
}
