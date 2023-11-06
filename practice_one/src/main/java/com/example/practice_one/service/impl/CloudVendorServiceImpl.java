package com.example.practice_one.service.impl;

import com.example.practice_one.model.CloudVendor;
import com.example.practice_one.repository.CloudVendorRepository;
import com.example.practice_one.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository){
        this.cloudVendorRepository = cloudVendorRepository;
    }

    // storing data in database
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);  // used to store data in db
        return "Success in adding data";
    }


    // updating data in database
    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success in updating data";
    }

    // deleting data
    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);  // used for deleting specific cloudVendor
        return "Success in delete";
    }

    // returning data
    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();  // returning data of specific cloudVendor based on input provided
    }

    // return all data
    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
