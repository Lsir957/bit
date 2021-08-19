package com.example.bit.dao;


import java.util.List;

import com.example.bit.bean.MiniUsers;
import com.example.bit.bean.MiniUsersExample;
import com.example.bit.bean.MiniUsersWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MiniUsersMapper {

    long countByExample(MiniUsersExample example);

    int deleteByExample(MiniUsersExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniUsersWithBLOBs record);

    int insertSelective(MiniUsersWithBLOBs record);

    List<MiniUsersWithBLOBs> selectByExampleWithBLOBs(@Param("name") String name);

    List<MiniUsers> selectByExample();

    MiniUsersWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniUsersWithBLOBs record, @Param("example") MiniUsersExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniUsersWithBLOBs record, @Param("example") MiniUsersExample example);

    int updateByExample(@Param("record") MiniUsers record, @Param("example") MiniUsersExample example);

    int updateByPrimaryKeySelective(MiniUsersWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MiniUsersWithBLOBs record);

    int updateByPrimaryKey(MiniUsers record);
}