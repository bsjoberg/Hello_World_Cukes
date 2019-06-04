import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class Steps {
    private HelloWorld helloWorld = null;
    private String hi = "";

    @Given("I have a hello world app")
    public void iHaveAHelloWorldApp() {
        // Write code here that turns the phrase above into concrete actions
        helloWorld = new HelloWorld();
    }

    @When("I ask it to say hi")
    public void iAskItToSayHi() {
        hi = helloWorld.sayHi();
    }

    @Then("it should answer with {string}")
    public void itShouldAnswerWith(String string) {
        Assert.assertEquals(string, hi);
    }
}
