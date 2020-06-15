package com.mkaya.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber2.json"},

        features = "@target/rerun.txt",
        glue = "com/vytrack/step_definitions"

)
public class FailCukesRunner {
}