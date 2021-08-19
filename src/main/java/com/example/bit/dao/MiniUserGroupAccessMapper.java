package com.example.bit.dao;

import com.itcast.bean.MiniUserGroupAccess;
import com.itcast.bean.MiniUserGroupAccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUserGroupAccessMapper {
    long countByExample(MiniUserGroupAccessExample example);

    int deleteByExample(MiniUserGroupAccessExample example);

    int insert(MiniUserGroupAccess record);

    int insertSelective(MiniUserGroupAccess record);

    List<MiniUserGroupAccess> selectByExample(MiniUserGroupAccessExample example);

    int updateByExampleSelective(@Param("record") MiniUserGroupAccess record, @Param("example") MiniUserGroupAccessExample example);

    int updateByExample(@Param("record") MiniUserGroupAccess record, @Param("example") MiniUserGroupAccessExample example);
}