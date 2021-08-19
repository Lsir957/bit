package com.example.bit.dao;

import com.itcast.bean.MiniRecord;
import com.itcast.bean.MiniRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniRecordMapper {
    long countByExample(MiniRecordExample example);

    int deleteByExample(MiniRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniRecord record);

    int insertSelective(MiniRecord record);

    List<MiniRecord> selectByExample(MiniRecordExample example);

    MiniRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniRecord record, @Param("example") MiniRecordExample example);

    int updateByExample(@Param("record") MiniRecord record, @Param("example") MiniRecordExample example);

    int updateByPrimaryKeySelective(MiniRecord record);

    int updateByPrimaryKey(MiniRecord record);
}