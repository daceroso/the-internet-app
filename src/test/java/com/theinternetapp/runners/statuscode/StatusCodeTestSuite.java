package com.theinternetapp.runners.statuscode;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "classpath:features/statuscode",
        glue = {"com.theinternetapp.stepdefinitions.statuscode"}
)
public class StatusCodeTestSuite {
}
