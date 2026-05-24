package com.seleniumgitdemo.runners;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/FeatureFiles",
        glue = "com.seleniumgitdemo.stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        monochrome = true,
        dryRun = false
)
// public class TestRunner extends AbstractTestNGCucumberTests {
// }
public class TestRunner{
    
}
