package com.Practise.Springboot.Cloud.Vendor.Information.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {cloudVendorNotFound.class})
    //Handles all the exception here by applying handler method.
    public ResponseEntity<Object>handleCloudVendorNotfoundException(cloudVendorNotFound cloudvendornotfound){
        CloudVendorException cloudVendorException =new CloudVendorException
                (cloudvendornotfound.getMessage(),
                cloudvendornotfound.getCause(),
                HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);
    }
}
