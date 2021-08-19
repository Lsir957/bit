package com.example.bit.dao;

import com.itcast.bean.MiniMenu;
import com.itcast.bean.MiniMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniMenuMapper {
    long countByExample(MiniMenuExample example);

    int deleteByExample(MiniMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniMenu record);

    int insertSelective(MiniMenu record);

    List<MiniMenu> selectByExample(MiniMenuExample example);

    MiniMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniMenu record, @Param("example") MiniMenuExample example);

    int updateByExample(@Param("record") MiniMenu record, @Param("example") MiniMenuExample example);

    int updateByPrimaryKeySelective(MiniMenu record);

    int updateByPrimaryKey(MiniMenu record);
}