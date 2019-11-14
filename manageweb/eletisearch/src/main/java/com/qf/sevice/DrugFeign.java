package com.qf.sevice;

import com.qf.domain.DrugMsg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Component
@FeignClient("DRUG")
public interface DrugFeign {
    @GetMapping("/findall")
    List<DrugMsg> selectAllDru1();
}
