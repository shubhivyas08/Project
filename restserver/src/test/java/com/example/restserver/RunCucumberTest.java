package com.example.restserver;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty"},features="src/test/java",snippets=SnippetType.CAMELCASE)

public class RunCucumberTest {

}
