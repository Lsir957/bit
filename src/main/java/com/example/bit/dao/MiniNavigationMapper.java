package com.example.bit.dao;

import com.itcast.bean.MiniNavigation;
import com.itcast.bean.MiniNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniNavigationMapper {
    long countByExample(MiniNavigationExample example);

    int deleteByExample(MiniNavigationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniNavigation record);

    int insertSelective(MiniNavigation record);

    List<MiniNavigation> selectByExample(MiniNavigationExample example);

    MiniNavigation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniNavigation record, @Param("example") MiniNavigationExample example);

    int updateByExample(@Param("record") MiniNavigation record, @Param("example") MiniNavigationExample example);

    int updateByPrimaryKeySelective(MiniNavigation record);

    int updateByPrimaryKey(MiniNavigation record);
}