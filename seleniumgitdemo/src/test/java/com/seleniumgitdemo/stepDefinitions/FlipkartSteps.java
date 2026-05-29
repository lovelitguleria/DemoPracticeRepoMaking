package com.seleniumgitdemo.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartSteps {
    private WebDriver driver;

    @Given("the browser is launched")
    public void setup() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @When("the user opens the Flipkart application")
    public void user_is_on_flipkart_homepage() {
        driver.get("https://www.flipkart.com");
    }

    @Then("the Flipkart home page should be displayed")
    public void verify_flipkart_homepage() {
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Flipkart home page is displayed successfully.");
        } else {
            System.out.println("Failed to load Flipkart home page. Expected title: " + expectedTitle + ", but got: " + actualTitle);
        }
    }

    @After
    public void teardown() {
        // if (driver != null) {
        //     driver.close();
        //     driver.quit();
        // }

        //comment added to check push functionality
        //new push
    }
}
