package stepRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features={".//Feature//Login.feature"},
		glue= {"framework.StepDefination"},
		monochrome=true,
		plugin= {"pretty"}
		)


public class Run {

}