package com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/bittechconsulting/eclipse-workspace/BTC191002E"
		+ "/BDDProject/config.feature"},tags= {"@smoke"},plugin = {"pretty","json:report/"
				+ "cucumber.json"}

)
public class RunnerClass {

}
