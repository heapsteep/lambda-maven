package com.heapsteep;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<Object,Object>{
    public Object handleRequest(Object input, Context context) {     
            System.out.println("==============> This will be printed in Log");     
            return "*******> Returned value from Heapsteep";     
    }
} 