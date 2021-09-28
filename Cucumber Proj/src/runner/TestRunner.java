package runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Feature/login.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="Feature/scenariooutline.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="Feature/background.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="Feature/login.feature",glue= {"stepDefinition"},tags= {"@invalid"})
//@CucumberOptions(features="Feature/datatable.feature",glue= {"stepDefinition"})
//@CucumberOptions(features="feature",glue= {"stepDefinition"},tags= {"@smoke"})
//@CucumberOptions(features="feature",glue= {"stepDefinition"},tags= {"@smoke"},plugin= {"pretty"},monochrome=true)

//@CucumberOptions(features="feature",glue= {"stepDefinition"},tags= {"@smoke"},plugin= {"usage"})
//@CucumberOptions(features="feature",glue= {"stepDefinition"},tags={"@smoke"},plugin={"pretty","html:target/cucumberhtmlreport"})
@CucumberOptions(features="feature",glue= {"stepDefinition"},tags={"@smoke"},plugin={"pretty","json:jsonreport/cucumberhtmlreport"})

//@CucumberOptions(features="feature/login.feature",glue= {"stepDefinition"},tags= {"@smoke"},plugin= {"pretty","junit:junitreport/cucumberjunitreport.xml"})

public class TestRunner {
    
}
