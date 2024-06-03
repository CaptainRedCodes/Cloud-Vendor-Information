package com.Practise.Springboot.Cloud.Vendor.Information.Repository;

import com.Practise.Springboot.Cloud.Vendor.Information.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cloudvendorRepo extends JpaRepository<CloudVendor,String> {
    //for flush method from JpaRepository
}


