package com.mongoFile.demo.controller;

import com.mongoFile.demo.repository.FileUploadRepository;
import com.mongoFile.demo.services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadFile(@RequestParam MultipartFile file) throws IOException {
        fileUploadService.unzip(file.getInputStream(), file.getOriginalFilename());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/upload")
    public ResponseEntity<?> getUploadFiles()  {
        Flux<?> files = fileUploadService.getAllFiles();
        return  new ResponseEntity<>(files, HttpStatus.CREATED);
    }


}
