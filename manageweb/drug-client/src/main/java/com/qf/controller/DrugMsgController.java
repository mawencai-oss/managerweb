package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.qf.domain.DrugMsg;
import com.qf.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
/*DrugMsg实体类的控制层*/
@RestController
public class DrugMsgController {
    @Autowired
    private DrugService drugService;//注入药品业务处理
    /*
    * params:DrugMsg对象
    * 插入提条一条记录*/
    @PostMapping("/insertDrug")
    public String insertDrug(@RequestBody DrugMsg drugMsg){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
        try {
            Date date = simpleDateFormat.parse(new Date().toString());
            drugMsg.setGmtModified(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return drugService.insert(drugMsg)>0?"添加成功":"添加失败";
    }
    /*查询全部记录*/
    @GetMapping("/findall")
    public List<DrugMsg> selectAllDru1(){
        return drugService.selectAllDrug();
    }
    /*根据id删除一条记录*/
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        return drugService.deleteById(id.longValue());
    }
    /*根据id查询一条记录*/
    @GetMapping("selectBydId/{id}")
    public DrugMsg drugMsg(@PathVariable("id") Long id){
        return drugService.selectBydId(id);
    }
    /*根据id更新这条记录*/
    @PostMapping("/updatedrug")
    public String updatedrug(@RequestBody DrugMsg drugMsg){
        return drugService.updatedrug(drugMsg);
    }
    @GetMapping("/findtype")
    public List findtype(){
        int cf=0;
        int fch=0;
        int ff=0;
        List<DrugMsg> msgs = this.selectAllDru1();
        for (DrugMsg msg : msgs) {
            if(msg.getDrugType().equals("处方")){
                cf++;
            }else if(msg.getDrugType().equals("复方制剂")){
                ff++;
            }else {
                fch++;
            }
        }
        ArrayList<Object> list = new ArrayList<>();
        list.add(cf);
        list.add(ff);
        list.add(fch);
        return list;
    }
}
