package com.qf.service;

import com.qf.domain.DrugMsg;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DrugService {
    int insert(DrugMsg drugMsg);//添加一条记录
    List<DrugMsg> selectAllDrug();//查询所有药品

    String deleteById(Long id);

    DrugMsg selectBydId(Long id);

    String updatedrug(DrugMsg drugMsg);
}
