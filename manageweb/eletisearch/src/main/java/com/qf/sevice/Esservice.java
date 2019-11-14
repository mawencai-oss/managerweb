package com.qf.sevice;

import com.qf.domain.DrugMsg;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Esservice {
    //药品信息到es索引库
    String  insert(DrugMsg drugMsg);//增加
    String delete(Long id);//删除
    String update(DrugMsg drugMsg);//修改
    List selectAll();//查全部
}
