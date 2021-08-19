package com.example.bit.dao;

import com.itcast.bean.MiniUsersDelete;
import com.itcast.bean.MiniUsersDeleteExample;
import com.itcast.bean.MiniUsersDeleteWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUsersDeleteMapper {
    long countByExample(MiniUsersDeleteExample example);

    int deleteByExample(MiniUsersDeleteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniUsersDeleteWithBLOBs record);

    int insertSelective(MiniUsersDeleteWithBLOBs record);

    List<MiniUsersDeleteWithBLOBs> selectByExampleWithBLOBs(MiniUsersDeleteExample example);

    List<MiniUsersDelete> selectByExample(MiniUsersDeleteExample example);

    MiniUsersDeleteWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniUsersDeleteWithBLOBs record, @Param("example") MiniUsersDeleteExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniUsersDeleteWithBLOBs record, @Param("example") MiniUsersDeleteExample example);

    int updateByExample(@Param("record") MiniUsersDelete record, @Param("example") MiniUsersDeleteExample example);

    int updateByPrimaryKeySelective(MiniUsersDeleteWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MiniUsersDeleteWithBLOBs record);

    int updateByPrimaryKey(MiniUsersDelete record);
}