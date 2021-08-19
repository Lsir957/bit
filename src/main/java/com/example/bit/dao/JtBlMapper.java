package com.example.bit.dao;

import com.itcast.bean.JtBl;
import com.itcast.bean.JtBlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JtBlMapper {
    long countByExample(JtBlExample example);

    int deleteByExample(JtBlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JtBl record);

    int insertSelective(JtBl record);

    List<JtBl> selectByExampleWithBLOBs(JtBlExample example);

    List<JtBl> selectByExample(JtBlExample example);

    JtBl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JtBl record, @Param("example") JtBlExample example);

    int updateByExampleWithBLOBs(@Param("record") JtBl record, @Param("example") JtBlExample example);

    int updateByExample(@Param("record") JtBl record, @Param("example") JtBlExample example);

    int updateByPrimaryKeySelective(JtBl record);

    int updateByPrimaryKeyWithBLOBs(JtBl record);

    int updateByPrimaryKey(JtBl record);
}