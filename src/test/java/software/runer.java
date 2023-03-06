package software;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "feature" ,monochrome=true,
          snippets = SnippetType.CAMELCASE,
          
          glue = {"software"})

public class runer {

}
