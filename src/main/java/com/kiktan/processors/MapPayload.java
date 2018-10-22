package com.kiktan.processors;

import com.kiktan.endpoint.InputSOATest;
import com.kiktan.endpoint.OutputSOATest;
import org.apache.camel.Headers;
import java.util.Map;

import javax.wsdl.Input;

public class MapPayload {

    public static String map(@Headers Map header, String custom){

        OutputSOATest ff = new OutputSOATest();
        ff.setResult("Welcome ");

        InputSOATest fff = new InputSOATest();
        fff.setTest("kolder");

        return custom;
    }
}
