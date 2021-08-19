package com.example.bit.dao;

import com.itcast.bean.MiniTermRelationships;
import com.itcast.bean.MiniTermRelationshipsExample;
import com.itcast.bean.MiniTermRelationshipsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniTermRelationshipsMapper {
    long countByExample(MiniTermRelationshipsExample example);

    int deleteByExample(MiniTermRelationshipsExample example);

    int deleteByPrimaryKey(MiniTermRelationshipsKey key);

    int insert(MiniTermRelationships record);

    int insertSelective(MiniTermRelationships record);

    List<MiniTermRelationships> selectByExample(MiniTermRelationshipsExample example);

    MiniTermRelationships selectByPrimaryKey(MiniTermRelationshipsKey key);

    int updateByExampleSelective(@Param("record") MiniTermRelationships record, @Param("example") MiniTermRelationshipsExample example);

    int updateByExample(@Param("record") MiniTermRelationships record, @Param("example") MiniTermRelationshipsExample example);

    int updateByPrimaryKeySelective(MiniTermRelationships record);

    int updateByPrimaryKey(MiniTermRelationships record);
}