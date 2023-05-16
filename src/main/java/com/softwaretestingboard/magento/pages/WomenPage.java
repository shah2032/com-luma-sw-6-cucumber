package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenPage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(linkText = "Tops")
    WebElement tops;

    @CacheLookup
    @FindBy(linkText = "Jackets")
    WebElement clickOnJackets;

    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement selectByFilterProductName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectByFilterPrice;


    public void mouseHoverOnWomen() {
        mouseHoverToElement(womenMenu);
        log.info("mouse hover on Women" + womenMenu.toString());
    }

    public void mouseHoverOnTop() {
        mouseHoverToElement(tops);
        log.info("mouse hove on Top" + tops.toString());
    }

    public void clickOnJacket() {
        clickOnElement(clickOnJackets);
        log.info("click on jackets" + clickOnJackets.toString());
    }

    public void selectFiletrFromDropDownList() {
        selectByVisibleTextFromDropDown(selectByFilterProductName, "Product Name");
        log.info("select filter from dropdown list" + selectByFilterProductName.toString());
    }

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> priceList;


    public void setSelectByFilterPrice() {
        selectByVisibleTextFromDropDown(selectByFilterPrice, "Price");
        log.info("select filter price" + selectByFilterPrice.toString());
    }

    public void getPriceLowToHigh() {
        List<WebElement> multiElement = driver.findElements(By.xpath("//span[@class='price-wrapper ']"));
        System.out.println("Total Items are: " + multiElement.size());
        double tmpValue = 0;
        for (WebElement list : multiElement) {
            String name1 = list.getText().replaceAll("[$]", "");
            System.out.println(name1);
            double itemValue = Double.valueOf(name1);
        }
    }
    public ArrayList<String> defaultProductList() {
        // Get all the products name and stored into array list
        List<WebElement> jacketsElementsList = productList;
        ArrayList<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsNameListBefore.add(e.getText());
        }
        System.out.println(jacketsNameListBefore);

        Reporter.log("get product name and store in array list" + productList.toString());
        return jacketsNameListBefore;

    }

    public ArrayList<String> afterSortingByProductName () {
        List<WebElement> jacketElementsList = productList;
        ArrayList<String> jacketNameAfter = new ArrayList<>();
        for (WebElement value : jacketElementsList) {
            jacketNameAfter.add(value.getText());
        }
        System.out.println(jacketNameAfter);

        Reporter.log("after sort jacket list" + productList.toString());
        return jacketNameAfter;

    }

    public ArrayList<Double> defaultProductsPriceList () {
        // Get all the products name and stored into array list
        List<WebElement> jacketsElementsList = priceList;
        ArrayList<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement e : jacketsElementsList) {
            jacketsPriceListBefore.add(Double.valueOf(e.getText().replace("$", "")));
        }
        System.out.println(jacketsPriceListBefore);
        Reporter.log("Default Product list" + priceList.toString());

        return jacketsPriceListBefore;
    }


    public ArrayList<Double> afterSortingByProductsPriceList () {
        List<WebElement> jacketElementsList = priceList;
        ArrayList<Double> jacketPriceAfter = new ArrayList<>();
        for (WebElement value : jacketElementsList) {
            jacketPriceAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        System.out.println(jacketPriceAfter);
        Reporter.log("Product list after sort by Price" + priceList.toString());

        return jacketPriceAfter;
    }
}


