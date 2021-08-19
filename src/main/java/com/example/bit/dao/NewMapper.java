package com.example.bit.dao;

import com.itcast.bean.New;
import com.itcast.bean.NewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewMapper {
    long countByExample(NewExample example);

    int deleteByExample(NewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(New record);

    int insertSelective(New record);

    List<New> selectByExampleWithBLOBs(NewExample example);

    List<New> selectByExample(NewExample example);

    New selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") New record, @Param("example") NewExample example);

    int updateByExampleWithBLOBs(@Param("record") New record, @Param("example") NewExample example);

    int updateByExample(@Param("record") New record, @Param("example") NewExample example);

    int updateByPrimaryKeySelective(New record);

    int updateByPrimaryKeyWithBLOBs(New record);

    int updateByPrimaryKey(New record);
}