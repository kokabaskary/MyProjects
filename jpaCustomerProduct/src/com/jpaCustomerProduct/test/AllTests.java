package com.jpaCustomerProduct.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CustomerServiceTest.class, ProductServiceTest.class })
public class AllTests {

}