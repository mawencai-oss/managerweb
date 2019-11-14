package com.qf.controller;

import com.qf.utils.FastUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class Upload {
    @Autowired
    FastUtils fastUtils;
    @PostMapping("/upload")
    public String  upload(MultipartFile file){
        return fastUtils.upload(file);
    }
}
