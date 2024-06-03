package com.Practise.Springboot.Cloud.Vendor.Information.Exception;

public class cloudVendorNotFound extends RuntimeException {
    public cloudVendorNotFound(String message) {
        super(message);
    }

    public cloudVendorNotFound(String message, Throwable cause) {
        super(message, cause);
    }
    //Helps in id not found exception
}
