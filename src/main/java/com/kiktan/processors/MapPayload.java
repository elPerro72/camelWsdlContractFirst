package com.kiktan.processors;

import com.kiktan.endpoint.InputSOATest;
import com.kiktan.endpoint.OutputSOATest;

import javax.wsdl.Input;

public class MapPayload {

    public static InputSOATest map(com.kiktan.endpoint.InputSOATest custom){

        OutputSOATest ff = new OutputSOATest();
        ff.setResult("Welcome ");

        return custom;
    }
}
