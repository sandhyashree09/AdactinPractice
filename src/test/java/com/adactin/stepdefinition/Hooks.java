package com.adactin.stepdefinition;

import java.io.IOException;

import com.automation.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before //cucumber.api.java
public void beforeHooks(Scenario scenario) {
		System.out.println(scenario.getName());
System.out.println("Started");

}
	@After //cucumber.api.java
	public void afterHooks(Scenario scenario) throws IOException {
		System.out.println("status:"+scenario.getStatus());
		if (scenario.isFailed()) {
			getScreenshot(scenario.getId());
			System.out.println("Screenshot taken");
		}
	System.out.println("completed");
}
}
