package api;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class ListCrypto extends BasePage{
	 private String transactionEndpoint = "/api/v1/transactions";
	    
	    public Response listTransactions(String token) {
	        return given()
	                   .header("Authorization", "Bearer " + token)
	                   .get(baseUrl + transactionEndpoint);
	    }

}
