package com.example.practice_one.repository;

import com.example.practice_one.model.CloudVendor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CloudVendorRepository extends MongoRepository<CloudVendor,String> {
}
