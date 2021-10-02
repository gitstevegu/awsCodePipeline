package org.steve.gu.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import java.util.Map;

public class LambdaMethodHandler {
    public String handleRequest(Map<String,Object> input, Context context) {
        context.getLogger().log("Input: " + input);
        Object queryStr = input.get("rawQueryString");
        return "Hello World - " + queryStr;
        //when passing String in the method as originally, aws return an error of json parsing when 
        //executing the code
    }
}
