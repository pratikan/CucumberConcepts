package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="/selenium_dev/CucumberFreeCRMLoginTest/src/test/java/features/DealTestMap.feature",
	glue={"stepDifinition"},
	plugin={"html:target/cucumber-html-report","pretty:target/cucumber-pretty.txt","json:target/cucumber.json","junit:target/cucumber.xml"},
    monochrome=true,
    strict=true,
    dryRun=false

		)
public class runnerMapTest {

}
