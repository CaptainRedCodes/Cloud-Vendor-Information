package com.Practise.Springboot.Cloud.Vendor.Information.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class responseHandler {
    public static ResponseEntity<Object>responseBuilder(String message, HttpStatus httpStatus,Object responseObject){

        Map<String,Object> response = new HashMap<>();
        response.put("Message",message);
        response.put("HTTPSTATUS",httpStatus);
        response.put("Response Object",responseObject);

        return new ResponseEntity<>(response,httpStatus);
    }
}
