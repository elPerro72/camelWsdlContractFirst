package com.kiktan.processors;

import java.util.List;
import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.kiktan.endpoint.InputSOATest;
import com.kiktan.endpoint.OutputSOATest;
import org.apache.cxf.binding.soap.SoapHeader;

public class CamelProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
    	
        //OutputSOATest out = new OutputSOATest();
        
        //Get input from exchange
        String body = exchange.getIn().getBody(String.class);
        Map<String, Object> headers = exchange.getIn().getHeaders();
        // OutputSOATest ff = (OutputSOATest) soaList.get(0);
      //  ff.setResult("Welcome ");
        //set output in exchange
        exchange.getOut().setBody((Object)body);
    }

}
