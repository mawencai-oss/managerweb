package com.qf.service.impl;

import com.qf.domain.DrugMsg;
import com.qf.domain.DrugMsgExample;
import com.qf.mapper.DrugMsgMapper;
import com.qf.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class DrugServiceImpl implements DrugService {
    @Autowired
    private DrugMsgMapper drugMsgMapper;
    @Override
    public String updatedrug(DrugMsg drugMsg) {
        drugMsg.setGmtModified(new Date());
        return drugMsgMapper.updateByPrimaryKeySelective(drugMsg)>0?"修改成功":"修改失败";
    }

    @Override
    public DrugMsg selectBydId(Long id) {
        return drugMsgMapper.selectByPrimaryKey(id);
    }

    @Override
    public String deleteById(Long id) {

        return drugMsgMapper.deleteByPrimaryKey(id)>0?"删除成功":"删除失败";
    }

    @Override
    public List<DrugMsg> selectAllDrug() {

        return drugMsgMapper.selectByExample(new DrugMsgExample());
    }

    @Override
    public int insert(DrugMsg drugMsg) {
        return drugMsgMapper.insert(drugMsg);
    }
}
