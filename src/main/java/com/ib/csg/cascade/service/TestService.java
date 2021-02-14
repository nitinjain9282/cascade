package com.ib.csg.cascade.service;

import org.springframework.stereotype.Component;

@Component

public class TestService {

    public boolean ValidateTest(String TestString){

        return TestString.equalsIgnoreCase("ValueShouldBeNitin");

    }

}
