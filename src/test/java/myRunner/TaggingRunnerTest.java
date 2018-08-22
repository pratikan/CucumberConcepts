/*package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="/selenium_dev/CucumberFreeCRMLoginTest/src/test/java/features/tagging.feature",
	glue={"stepDifinition"},
	plugin={"html:target/cucumber-html-report","pretty:target/cucumber-pretty.txt","json:target/cucumber.json","junit:target/cucumber.xml"},
    monochrome=true,
    strict=true,
    dryRun=true,
    tags={"~@SmokeTest" , "@RegressionTest"}
    )
public class TaggingRunnerTest {

}
//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	
*/