package com.rest.api.tests.sample;

import java.io.File;

import fitnesse.junit.JUnitHelper;

public class RunnerTest {

    private JUnitHelper helper;

    @Before
    public void prepare() {
        helper = new JUnitHelper("src/main/resources", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureTests() throws Exception {
        helper.assertSuitePasses("MyTestSamples.MySample1");
    }
}
