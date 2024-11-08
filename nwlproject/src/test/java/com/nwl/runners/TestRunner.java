package com.nwl.runners;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"com.nwl.steps"},
		plugin = { "pretty",
				"html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"},
		monochrome = true,
		tags = "@55149"
		)

public class TestRunner {
	
    private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun=true)
    public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
	
    @Test(groups = "cucumber", dataProvider = "scenarios", description = "Runs Cucumber Feature")
    public void scenario(PickleWrapper pickle, FeatureWrapper cucumberFeature) {
    	testNGCucumberRunner.runScenario(pickle.getPickle());
    }
    
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun=true)
    public void tearDownClass() {
    	testNGCucumberRunner.finish();
    }
	
}
