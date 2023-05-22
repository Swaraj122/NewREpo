package RUNNER;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(features = "/Users/SW20466288/eclipse-workspace/Cucumber/src/main/java/FEATURE/test2.feature", glue = {

		"Binding" })

public class Runner2 extends AbstractTestNGCucumberTests{

}
