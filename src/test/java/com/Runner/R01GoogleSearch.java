package com.Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features =  {"src\\test\\resources\\fo2googlesearch.feature"},                    
              glue = {"com.stepdefination"})
public class R01GoogleSearch {
}
