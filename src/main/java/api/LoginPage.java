package api;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class LoginPage extends BasePage {
    private String endpoint = "/api/v1/login";
    
    public Response loginUser(String username, String password) {
        String requestBody = "{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }";
        return sendPostRequest(endpoint, requestBody);
    }
}
