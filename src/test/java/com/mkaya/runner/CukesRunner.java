package com.mkaya.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/com/mkaya/features",
        glue = "com/mkaya/step_definitions",
        tags = "@login",
        dryRun = false
)
public class CukesRunner {
}
