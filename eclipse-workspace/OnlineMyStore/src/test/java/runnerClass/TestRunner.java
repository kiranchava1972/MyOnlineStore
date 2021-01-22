package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Owner\\eclipse-workspace\\OnlineMyStore\\src\\test\\resources\\Features\\register.feature",glue= {"stepDefinations"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports",
		"json:target/Cucumber.json",
		"junit:target/JunitReports/Reports.xml"}
)
public class TestRunner {

}
