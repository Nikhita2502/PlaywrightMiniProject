package StepDefinition;

import Pages.Scenarios;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ScenarioStepDefinition {
    @Given("navigate to playwright page")
    public void navigate_to_playwright_page() {
Scenarios.launchpad();
    }
    @When("select Java from the dropdown with name Node.js")
    public void selectJavaFromTheDropdownWithNameNodeJs() {
        Scenarios.selectDropdown();
    }

    @And("confirm the java page is opened")
    public void confirmTheJavaPageIsOpened() {
        Scenarios.validateJavaOpens();
    }

    @When("click on the search box")
    public void click_on_the_search_box() {
Scenarios.searchBox();
    }

    @And("enter {string} in the search box")
    public void enterInTheSearchBox(String string1) {
        Scenarios.searchTopic(string1);
    }


    @Then("should see the {string} topic in the page")
    public void shouldSeeTheTopicInThePage(String string2) {
        Scenarios.confirmTopic(string2);
    }
    @Then("close the browser window")
    public void close_the_browser_window() {
//ScenariosTest.closePage();
    }










}

