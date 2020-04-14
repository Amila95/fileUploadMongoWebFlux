package com.mongoFile.demo.repository;


import com.mongoFile.demo.modal.FileUpload;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public interface FileUploadRepository extends ReactiveMongoRepository<FileUpload, Long> {


}
