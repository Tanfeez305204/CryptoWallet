package api;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BasePage {
    protected String baseUrl = "https://crypto-wallet-server.mock.beeceptor.com";
    
    public Response sendPostRequest(String endpoint, Object body) {
        return given()
                   .header("Content-Type", "application/json")
                   .body(body)
                   .post(baseUrl + endpoint);
    }
    
    public Response sendGetRequest(String endpoint) {
        return given()
                   .header("Content-Type", "application/json")
                   .get(baseUrl + endpoint);
    }
}
