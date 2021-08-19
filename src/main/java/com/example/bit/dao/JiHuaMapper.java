package com.example.bit.dao;

import com.itcast.bean.JiHua;
import com.itcast.bean.JiHuaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiHuaMapper {
    long countByExample(JiHuaExample example);

    int deleteByExample(JiHuaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JiHua record);

    int insertSelective(JiHua record);

    List<JiHua> selectByExampleWithBLOBs(JiHuaExample example);

    List<JiHua> selectByExample(JiHuaExample example);

    JiHua selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JiHua record, @Param("example") JiHuaExample example);

    int updateByExampleWithBLOBs(@Param("record") JiHua record, @Param("example") JiHuaExample example);

    int updateByExample(@Param("record") JiHua record, @Param("example") JiHuaExample example);

    int updateByPrimaryKeySelective(JiHua record);

    int updateByPrimaryKeyWithBLOBs(JiHua record);

    int updateByPrimaryKey(JiHua record);
}