package com.qf.controller;

import com.qf.domain.DocMsg;
import com.qf.service.DocMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocMsgController {
    @Autowired
    DocMsgService docMsgService;
    @PostMapping("/insertdocmsg")
    public String insertdocmsg(@RequestBody DocMsg docMsg){
        return docMsgService.insertdocmsg(docMsg);
    }
    @GetMapping("/findall")
    public List<DocMsg> docMsgList(){
        return docMsgService.docMsgList();
    }
    @GetMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Long id){
        return docMsgService.deleteById(id);
    }
    @GetMapping("/findbyid/{id}")
    public DocMsg docMsg(@PathVariable Long id){
        return docMsgService.findbyid(id);
    }
    @PostMapping("/updatedocmsg")
    public String updatedocmsg(@RequestBody DocMsg docMsg){
        return docMsgService.updatedocmsg(docMsg);
    }
    @GetMapping("/findnames")
    public List<String> findnames(){
        return docMsgService.findnames();
    }
    @GetMapping("/config")
    public String string(){
        return "123";
    }
}
