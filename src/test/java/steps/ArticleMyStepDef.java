package steps;

import implementation.ArticleServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.ValidatableResponse;
import org.junit.Assert;
import service.ArticleService;

import static context.RunContext.RUN_CONTEXT;

public class ArticleMyStepDef {
    ArticleService articleService = new ArticleServiceImpl();

    @Given("Get Articles {string} Request")
    public void getArticlesRequest(String url) {
        articleService.getArticles(url);
    }

    @Then("Response code is: {string}")
    public void responseCodeIs(String status) {
        ValidatableResponse response = RUN_CONTEXT.get("responce", ValidatableResponse.class);
        int actualStatus = response.extract().statusCode();
        int expectedStatus = Integer.parseInt(status);
        Assert.assertEquals(actualStatus, expectedStatus);
    }
}
