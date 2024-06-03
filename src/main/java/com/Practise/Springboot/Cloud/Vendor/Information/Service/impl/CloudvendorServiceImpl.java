//business or service layer

package com.Practise.Springboot.Cloud.Vendor.Information.Service.impl;

import com.Practise.Springboot.Cloud.Vendor.Information.Exception.cloudVendorNotFound;
import com.Practise.Springboot.Cloud.Vendor.Information.Repository.cloudvendorRepo;
import com.Practise.Springboot.Cloud.Vendor.Information.Service.cloudvendorService;
import com.Practise.Springboot.Cloud.Vendor.Information.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudvendorServiceImpl implements cloudvendorService {

    cloudvendorRepo cloudvendorRepo;
    public CloudvendorServiceImpl(com.Practise.Springboot.Cloud.Vendor.Information.Repository.cloudvendorRepo cloudvendorRepo) {
        this.cloudvendorRepo = cloudvendorRepo;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudvendor) {
        cloudvendorRepo.save(cloudvendor);
        return "Success in Creating!";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudvendor) {
        cloudvendorRepo.save(cloudvendor);
        return "Updated Successfully";
    }

  /*  @Override
    String UpdateCreate(CloudVendor cloudVendor){
        cloudvendorRepo.save(cloudVendor);
        return "Operation done successfully";
    }*/

    @Override
    public String deleteCloudVendor(String cloudvendorID) {
        cloudvendorRepo.deleteById(cloudvendorID);
        return "Deleted Successfully";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudvendorID) {
        if(cloudvendorRepo.findById(cloudvendorID).isEmpty()){
            throw new cloudVendorNotFound("Requested ID does not exists!");
        }
        return cloudvendorRepo.findById(cloudvendorID).get();
    }

    @Override
    public List<CloudVendor> getallCloudVendor() {
        return cloudvendorRepo.findAll();

    }
}
