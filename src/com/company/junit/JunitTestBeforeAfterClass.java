package com.company.junit;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JunitTestBeforeAfterClass {
    @BeforeClass
    public static void beforeTest(){
        System.out.println("Running before Class ");
    }
    @Test
    public void test_add_positive_numbers() {
        Addition app1 = new Addition();
        assertEquals(10, app1.add(5, 5));
        assertEquals(15, app1.add(10, 5));
        assertNotEquals(123, app1.add(12,345));
        System.out.println("Running addition test for positive numbers");
    }

    @Test
    public void test_add_add_negative_numbers() {
        Addition app1 = new Addition();
        assertEquals(-10, app1.add(-5, -5));
        assertEquals(-15, app1.add(-10, -5));
        assertNotEquals(-123, app1.add(-12,-345));
        System.out.println("Running addition test for negative numbers");
    }
    @AfterClass
    public static void afterTest(){
        System.out.println("Running after Class ");
    }

}
