package com.example.bit.dao;

import com.itcast.bean.MiniEmailCheck;
import com.itcast.bean.MiniEmailCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniEmailCheckMapper {
    long countByExample(MiniEmailCheckExample example);

    int deleteByExample(MiniEmailCheckExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniEmailCheck record);

    int insertSelective(MiniEmailCheck record);

    List<MiniEmailCheck> selectByExample(MiniEmailCheckExample example);

    MiniEmailCheck selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniEmailCheck record, @Param("example") MiniEmailCheckExample example);

    int updateByExample(@Param("record") MiniEmailCheck record, @Param("example") MiniEmailCheckExample example);

    int updateByPrimaryKeySelective(MiniEmailCheck record);

    int updateByPrimaryKey(MiniEmailCheck record);
}