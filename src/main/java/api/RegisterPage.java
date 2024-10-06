package api;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class RegisterPage extends BasePage {
    private String endpoint = "/api/v1/register";
    
    public Response registerUser(String username, String password, String email) {
        String requestBody = "{ \"username\": \"" + username + "\", \"password\": \"" + password + "\", \"email\": \"" + email + "\" }";
        return sendPostRequest(endpoint, requestBody);
    }
}
