package steps.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

/**
 * Created by Nikasan
 */
public class MyStepdefs {

    @Given("open page by {string}")
    public void openPageBy(String url) {
        System.out.println(url);
    }

    @And("open page")
    public void openPage() {
        System.out.println("Do smth");
    }
}
