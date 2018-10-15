package com.kiktan.processors;

import com.kiktan.endpoint.OutputSOATest;

public class MapPayload {

    public static OutputSOATest map(com.kiktan.endpoint.InputSOATest custom){

        OutputSOATest ff = new OutputSOATest();
        ff.setResult("Welcome ");

        return ff;
    }
}
