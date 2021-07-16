package com.company.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //Provide all the test that you wanted to run
        JunitTest.class
})
public class JUnitTestSuite {
}
