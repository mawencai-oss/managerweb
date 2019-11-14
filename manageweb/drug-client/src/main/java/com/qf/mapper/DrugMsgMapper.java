package com.qf.mapper;

import com.qf.domain.DrugMsg;
import com.qf.domain.DrugMsgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DrugMsgMapper {
    int countByExample(DrugMsgExample example);

    int deleteByExample(DrugMsgExample example);

    int deleteByPrimaryKey(Long pkDrugid);

    int insert(DrugMsg record);

    int insertSelective(DrugMsg record);

    List<DrugMsg> selectByExample(DrugMsgExample example);

    DrugMsg selectByPrimaryKey(Long pkDrugid);

    int updateByExampleSelective(@Param("record") DrugMsg record, @Param("example") DrugMsgExample example);

    int updateByExample(@Param("record") DrugMsg record, @Param("example") DrugMsgExample example);

    int updateByPrimaryKeySelective(DrugMsg record);

    int updateByPrimaryKey(DrugMsg record);
}