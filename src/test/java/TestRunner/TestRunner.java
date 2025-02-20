package TestRunner;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"StepDefinitions"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}
)
public class TestRunner {
}