package ctest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/java/ctest/feature/",
				glue = {"tetDefinationpak"},
				dryRun = false
		)
public class TestRunner {

}
