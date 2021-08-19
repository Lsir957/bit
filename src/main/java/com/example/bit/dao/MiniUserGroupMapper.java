package com.example.bit.dao;

import com.itcast.bean.MiniUserGroup;
import com.itcast.bean.MiniUserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUserGroupMapper {
    long countByExample(MiniUserGroupExample example);

    int deleteByExample(MiniUserGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniUserGroup record);

    int insertSelective(MiniUserGroup record);

    List<MiniUserGroup> selectByExample(MiniUserGroupExample example);

    MiniUserGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniUserGroup record, @Param("example") MiniUserGroupExample example);

    int updateByExample(@Param("record") MiniUserGroup record, @Param("example") MiniUserGroupExample example);

    int updateByPrimaryKeySelective(MiniUserGroup record);

    int updateByPrimaryKey(MiniUserGroup record);
}