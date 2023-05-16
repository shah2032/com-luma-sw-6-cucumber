package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.MenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenTestSteps {
    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new MenPage().mouseHoverOnMenMenu();

    }

    @And("^I mouse hover on bottoms$")
    public void iMouseHoverOnBottoms() {
        new MenPage().mouseHoverOnBottoms();
    }

    @And("^I click on pants$")
    public void iClickOnPants() {
        new MenPage().clickOnPants();
    }

    @And("^I mouse hover on product name Cronus Yoga Pant and click on size (\\d+)$")
    public void iMouseHoverOnProductNameCronusYogaPantAndClickOnSize(int arg0) {
        new MenPage().sortByProductName();
        new MenPage().clickOnCronousSize32();
    }

    @And("^I click on black colour$")
    public void iClickOnBlackColour() {
        new MenPage().clickOnCronousBlack();
    }

    @And("^I mouse hover on product name and click on add to cart button$")
    public void iMouseHoverOnProductNameAndClickOnAddToCartButton() {
        new MenPage().mouseHoverOnCronusYogaAndClickAddCart();

    }

    @Then("^I verify You added Cronus Yoga Pant to your shopping cart$")
    public void iVerifyYouAddedCronusYogaPantToYourShoppingCart() {
        Assert.assertEquals(new MenPage().getSuccessMsgText(),"You added Cronus Yoga Pant to your shopping cart.");
    }

    @And("^I click on Shopping Cart link$")
    public void iClickOnShoppingCartLink() {
        new MenPage().clickOnShoppingCartLink();
    }

    @And("^I verify shopping  cart text$")
    public void iVerifyShoppingCartText() {
        Assert.assertEquals(new MenPage().getShoppingCartText(),"Shopping Cart");
    }

    @And("^I verify product name Cornus Yoga pant$")
    public void iVerifyProductNameCornusYogaPant() {
        Assert.assertEquals(new MenPage().getProductName(),"Cronus Yoga Pant");
    }

    @And("^I verify product size (\\d+)$")
    public void iVerifyProductSize(int arg0) {
        Assert.assertEquals(new MenPage().getProductSize(),"32");
    }

    @Then("^I verify product colour black$")
    public void iVerifyProductColourBlack() {
        Assert.assertEquals(new MenPage().getProductColour(),"Black");
    }
}

