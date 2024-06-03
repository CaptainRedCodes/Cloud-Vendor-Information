package com.Practise.Springboot.Cloud.Vendor.Information.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class responseAllHandler {
    public static ResponseEntity<Object> allResponseBuilder(String message, HttpStatus httpStatus,Object allresobject){
        Map<String,Object>responseall=new HashMap<>();
        responseall.put("Message",message);
        responseall.put("HTTP REQUEST",httpStatus);
        responseall.put("Response Object",allresobject);

        return new ResponseEntity<>(responseall,httpStatus);



    }
}
