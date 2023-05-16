package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenPageSteps {
    @When("^I mouse hover on women menu$")
    public void iMouseHoverOnWomenMenu() {
        new WomenPage().mouseHoverOnWomen();
    }

    @And("^I mouse hover on Tops$")
    public void iMouseHoverOnTops() {
        new WomenPage().mouseHoverOnTop();
    }

    @And("^I click on jackets$")
    public void iClickOnJackets() {
        new WomenPage().clickOnJacket();
    }

    @And("^I select sort by filter product name$")
    public void iSelectSortByFilterProductName() {
        new WomenPage().selectFiletrFromDropDownList();
    }

    @Then("^I verify products name display in alphabetical order$")
    public void iVerifyProductsNameDisplayInAlphabeticalOrder() {
        Assert.assertEquals(new WomenPage().afterSortingByProductName(),new WomenPage().defaultProductList());

    }

    @And("^I select sort by filter price$")
    public void iSelectSortByFilterPrice() {
        new WomenPage().setSelectByFilterPrice();
    }

    @Then("^I verify products price display in low to high$")
    public void iVerifyProductsPriceDisplayInLowToHigh() {
        Assert.assertEquals(new WomenPage().defaultProductsPriceList(),new WomenPage().afterSortingByProductsPriceList());
    }
}
