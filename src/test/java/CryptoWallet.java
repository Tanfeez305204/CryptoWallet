import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.BalancePage;
import api.ExchangeRate;
import api.FeePage;
import api.LoginPage;
import api.RegisterPage;
import api.TransactionPage;

public class CryptoWallet {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    BalancePage balancePage = new BalancePage();
    TransactionPage transactionPage = new TransactionPage();
    FeePage feePage = new FeePage();
    ExchangeRate exchangeRatePage = new ExchangeRate();

    // Data Provider for registration functionality
    
    @DataProvider(name = "registerData")
    public Object[][] registerDataProvider() {
        return new Object[][]{
                {"user1", "pass123", "user1@example.com"},
                {"user2", "pass123", "user2@example.com"},
                {"user3", "pass123", "user3@example.com"}
        };
    }

    // test case for registration
    
    @Test(dataProvider = "registerData")
    public void testUserRegistration(String username, String password, String email) {
        Response response = registerPage.registerUser(username, password, email);
        System.out.println("Register Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // Data Provider for login
    
    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() {
        return new Object[][]{
                {"user1", "pass123"},
                {"user2", "pass123"},
                {"user3", "pass123"}
        };
    }

    @Test(dataProvider = "loginData")
    public void testUserLogin(String username, String password) {
        Response response = loginPage.loginUser(username, password);
        System.out.println("Login Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // Test check balance using hard coded token
    @Test
    public void testCheckBalance() {
        String token = "sampleToken";
        Response response = balancePage.checkBalance(token);
        System.out.println("Balance Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // Data Provider for transferring cryptoCurrency.
    
    @DataProvider(name = "transferData")
    public Object[][] transferDataProvider() {
        return new Object[][]{
                {"sampleToken", "walletAddress123", 50.00},
                {"sampleToken", "walletAddress456", 100.00},
                {"sampleToken", "walletAddress789", 150.00}
        };
    }

    @Test(dataProvider = "transferData")
    public void testTransferCrypto(String token, String toAddress, double amount) {
        Response response = transactionPage.transferCrypto(token, toAddress, amount);
        System.out.println("Transfer Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // Data Provider for fee calculation
    @DataProvider(name = "feeData")
    public Object[][] feeDataProvider() {
        return new Object[][]{
                {"BTC", 50.00},
                {"ETH", 100.00},
                {"LTC", 150.00}
        };
    }

    @Test(dataProvider = "feeData")
    public void testCalculateFee(String currency, double amount) {
        Response response = feePage.calculateFee(currency, amount);
        System.out.println("Fee Calculation Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    // Test for retrieving exchange rates
    
    @Test
    public void testGetExchangeRates() {
        Response response = exchangeRatePage.getExchangeRates();
        System.out.println("Exchange Rates Response: " + response.getBody().asString());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
