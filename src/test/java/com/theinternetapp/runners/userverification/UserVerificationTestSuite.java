package com.theinternetapp.runners.userverification;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "classpath:features/userverification",
        glue = {"com.theinternetapp.stepdefinitions.userverification"}
)
public class UserVerificationTestSuite {

}
