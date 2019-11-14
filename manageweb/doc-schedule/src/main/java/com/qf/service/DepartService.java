package com.qf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
@FeignClient("DRUGDEPART")
public interface DepartService {
    @GetMapping("/findnames")
    public List<String> findnames();
}
