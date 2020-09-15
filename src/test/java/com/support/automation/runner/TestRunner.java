package com.support.automation.runner;



import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles/login.feature"}, glue={"classpath:com.support.automation.stepdef","classpath:com.support.automation.base"}, plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})
public class TestRunner {

}
