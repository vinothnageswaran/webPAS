package step_definitions;

//test1234567891-Vinoth03April2018

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.runtime.CucumberException;

//test11

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        toPDF = false,
        outputFolder = "target")


//@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "classpath:features",
		
			features = "src/test/resources/features/Webpas.feature",
		//plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
		
				plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json",
		        "junit:target/cucumber-results.xml"
		        },
		tags = {}
		
		
		
		
		)
public class RunCukesTest{
	


	@BeforeClass
	
	public static void generateReport1() throws Throwable
	
	
	{
		
		
	}
	
	
	
	
	@AfterClass
	public static void generateReport() throws Throwable
	{
		
		System.out.println(" inside after class");
		
	
		    //scenario.write("Text you want to write in junit report");
	
		Thread.sleep(5000);
	CucumberResultsOverview results = new CucumberResultsOverview();
	results.setOutputDirectory(".//target");
	results.setOutputName(".//target//cucumber-results");
	results.setSourceFile(".//target//cucumber.json");
	results.executeFeaturesOverviewReport();
	}	
	
}

