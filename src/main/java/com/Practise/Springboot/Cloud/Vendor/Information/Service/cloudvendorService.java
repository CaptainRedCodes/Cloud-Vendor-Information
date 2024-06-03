package com.Practise.Springboot.Cloud.Vendor.Information.Service;

import com.Practise.Springboot.Cloud.Vendor.Information.model.CloudVendor;
import java.util.List;

public interface cloudvendorService {

    public String createCloudVendor(CloudVendor cloudvendor);

    public String updateCloudVendor(CloudVendor cloudvendor);

    public String deleteCloudVendor(String cloudvendorID);
    public CloudVendor getCloudVendor(String cloudvendorID);
    public List<CloudVendor> getallCloudVendor();
}
