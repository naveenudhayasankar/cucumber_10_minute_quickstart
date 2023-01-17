package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;

class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        }
        else {
            return "Nope";
        }
    }
}

public class StepDefinitions {
    private String today;
    private String actualAnswer;


    @Given("Today is {string}")
    public void today_is_sunday(String actualDay) {
        today = actualDay;
    }
    @When("I ask if it's Friday yet")
    public void i_ask_if_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        Assertions.assertEquals(expectedAnswer, actualAnswer);
    }



}
