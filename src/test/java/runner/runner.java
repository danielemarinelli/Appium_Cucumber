package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/java/features"},
        glue = {"steps","utility"},
        plugin = {"pretty","json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"},
        tags = {"@appium"}

)

public class runner {
}
