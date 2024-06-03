package com.Practise.Springboot.Cloud.Vendor.Information.Controller;


import com.Practise.Springboot.Cloud.Vendor.Information.Service.cloudvendorService;
import com.Practise.Springboot.Cloud.Vendor.Information.model.CloudVendor;
import com.Practise.Springboot.Cloud.Vendor.Information.response.responseAllHandler;
import com.Practise.Springboot.Cloud.Vendor.Information.response.responseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud")
public class CloudAPIService {
    cloudvendorService cloudvendorservice;
    public CloudAPIService(cloudvendorService cloudvendorservice) {
        this.cloudvendorservice = cloudvendorservice;
    }



    @GetMapping("{vendorID}") //for specific
    public ResponseEntity<Object> getCloudVendorDetails(@PathVariable("vendorID") String vendorID) {
        return responseHandler.responseBuilder("The requested Details are given", HttpStatus.OK, cloudvendorservice.getCloudVendor(vendorID));
    }

    @GetMapping//for all
    public ResponseEntity<Object> getallCloudVendorDetails(){
        return responseAllHandler.allResponseBuilder("All the details are given",HttpStatus.OK,cloudvendorservice.getallCloudVendor());

    }

    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        cloudvendorservice.createCloudVendor(cloudvendor);
        return "Created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudvendor){
        cloudvendorservice.updateCloudVendor(cloudvendor);
        return "Updated the Info SuccessFully";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendorDetails(@PathVariable("vendorID") String vendorID){
        cloudvendorservice.deleteCloudVendor(vendorID);
        return "Deleted the target Successfully";
    }
}
