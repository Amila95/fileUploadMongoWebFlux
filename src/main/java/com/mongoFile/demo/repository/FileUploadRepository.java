package com.mongoFile.demo.repository;


import com.mongoFile.demo.modal.FileUpload;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface FileUploadRepository extends ReactiveMongoRepository<FileUpload, Long> {
//public interface FileUploadRepository extends MongoRepository<FileUpload, Long> {



}
