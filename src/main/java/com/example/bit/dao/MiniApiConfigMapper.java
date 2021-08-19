package com.example.bit.dao;

import com.itcast.bean.MiniApiConfig;
import com.itcast.bean.MiniApiConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniApiConfigMapper {
    long countByExample(MiniApiConfigExample example);

    int deleteByExample(MiniApiConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniApiConfig record);

    int insertSelective(MiniApiConfig record);

    List<MiniApiConfig> selectByExample(MiniApiConfigExample example);

    MiniApiConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniApiConfig record, @Param("example") MiniApiConfigExample example);

    int updateByExample(@Param("record") MiniApiConfig record, @Param("example") MiniApiConfigExample example);

    int updateByPrimaryKeySelective(MiniApiConfig record);

    int updateByPrimaryKey(MiniApiConfig record);
}