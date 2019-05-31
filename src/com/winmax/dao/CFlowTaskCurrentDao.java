package com.winmax.dao;

import com.winmax.model.CFlowTaskCurrent;
import com.winmax.model.CFlowTaskCurrentQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CFlowTaskCurrentDao {
    int countByExample(CFlowTaskCurrentQuery example);

    int deleteByExample(CFlowTaskCurrentQuery example);

    int deleteByPrimaryKey(Long id);

    int insert(CFlowTaskCurrent record);

    int insertSelective(CFlowTaskCurrent record);

    List<CFlowTaskCurrent> selectByExample(CFlowTaskCurrentQuery example);

    CFlowTaskCurrent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CFlowTaskCurrent record, @Param("example") CFlowTaskCurrentQuery example);

    int updateByExample(@Param("record") CFlowTaskCurrent record, @Param("example") CFlowTaskCurrentQuery example);

    int updateByPrimaryKeySelective(CFlowTaskCurrent record);

    int updateByPrimaryKey(CFlowTaskCurrent record);
}