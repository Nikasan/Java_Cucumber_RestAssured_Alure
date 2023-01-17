package steps.cucumber;

import io.cucumber.java8.En;

/**
 * Created by Nikasan
 */
public class LambdasSteps implements En {

    public LambdasSteps() {
        Given("open page with url {string}", (String string) -> {
            System.out.println(string);
        });
        And("^open page with lambda$", () -> {
            System.out.println("Lambdas cool");
        });
    }
}
