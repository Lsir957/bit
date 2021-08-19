package com.example.bit.dao;

import com.itcast.bean.MiniWxMenu;
import com.itcast.bean.MiniWxMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniWxMenuMapper {
    long countByExample(MiniWxMenuExample example);

    int deleteByExample(MiniWxMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniWxMenu record);

    int insertSelective(MiniWxMenu record);

    List<MiniWxMenu> selectByExample(MiniWxMenuExample example);

    MiniWxMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniWxMenu record, @Param("example") MiniWxMenuExample example);

    int updateByExample(@Param("record") MiniWxMenu record, @Param("example") MiniWxMenuExample example);

    int updateByPrimaryKeySelective(MiniWxMenu record);

    int updateByPrimaryKey(MiniWxMenu record);
}