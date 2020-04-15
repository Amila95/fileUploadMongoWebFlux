package com.mongoFile.demo.controller;

import com.mongoFile.demo.modal.FileUpload;
import com.mongoFile.demo.repository.FileUploadRepository;
import com.mongoFile.demo.services.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
//import reactor.core.publisher.Flux;

import java.io.IOException;
import java.time.Duration;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FileUploadController {
    @Autowired
    FileUploadService fileUploadService;

    @Autowired
    private FileUploadRepository fileUploadRepository;

//    @PostMapping("/upload")
//    public FileUpload saveFile(@RequestBody FileUpload fileUpload){
//        return fileUploadRepository.save(fileUpload);
//    }

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity uploadFile(@RequestParam MultipartFile file) throws IOException {
        fileUploadService.unzip(file.getInputStream(), file.getOriginalFilename());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/upload")
    public Flux<FileUpload> getUploadFiles()  {
          Flux<Long> interval = Flux.interval(Duration.ofSeconds(2));
//        Flux<?> files = fileUploadService.getAllFiles().subscribeOn((Scheduler) interval);
//        return  new ResponseEntity<>(files, HttpStatus.CREATED);
        return fileUploadRepository.findAll();
    }


}
