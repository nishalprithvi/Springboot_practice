package com.example.practice_one.controller;

import com.example.practice_one.model.CloudVendor;
import com.example.practice_one.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorInfoController {

    @Autowired
    CloudVendorService cloudVendorService;

    //public CloudVendorInfoController(CloudVendorService cloudVendorService){
    //    this.cloudVendorService = cloudVendorService;
    //}



    // getting specific data
    @GetMapping("{vendorId}")  // this is for getting/fetching the data
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendor(vendorId);
        //return new CloudVendor("AZ","Azure","Seattle","10023");
    }

    // getting all data
    @GetMapping
    public List<CloudVendor> getAllCloudVendor(){
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping // this for sending the data
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Details added";
    }

    @PutMapping  // this is for updating the details
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Details updated";
    }

    @DeleteMapping("{vendorId}")  // this is for updating the details
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Details deleted";
    }

}
