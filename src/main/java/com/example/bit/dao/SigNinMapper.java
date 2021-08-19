package com.example.bit.dao;

import com.itcast.bean.SigNin;
import com.itcast.bean.SigNinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SigNinMapper {
    long countByExample(SigNinExample example);

    int deleteByExample(SigNinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SigNin record);

    int insertSelective(SigNin record);

    List<SigNin> selectByExample(SigNinExample example);

    SigNin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SigNin record, @Param("example") SigNinExample example);

    int updateByExample(@Param("record") SigNin record, @Param("example") SigNinExample example);

    int updateByPrimaryKeySelective(SigNin record);

    int updateByPrimaryKey(SigNin record);
}