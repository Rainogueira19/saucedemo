package saucedemo.automation.git.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import saucedemo.automation.git.drivers.Drivers;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		tags = "@login",
		glue = "steps",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber-reports.html"},
		snippets = SnippetType.CAMELCASE
		
		
		)


public class Executa extends Drivers{
	
	//public static void iniciarTeste() {
	

}
