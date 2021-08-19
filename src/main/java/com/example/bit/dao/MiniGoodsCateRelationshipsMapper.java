package com.example.bit.dao;

import com.itcast.bean.MiniGoodsCateRelationships;
import com.itcast.bean.MiniGoodsCateRelationshipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniGoodsCateRelationshipsMapper {
    long countByExample(MiniGoodsCateRelationshipsExample example);

    int deleteByExample(MiniGoodsCateRelationshipsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniGoodsCateRelationships record);

    int insertSelective(MiniGoodsCateRelationships record);

    List<MiniGoodsCateRelationships> selectByExample(MiniGoodsCateRelationshipsExample example);

    MiniGoodsCateRelationships selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniGoodsCateRelationships record, @Param("example") MiniGoodsCateRelationshipsExample example);

    int updateByExample(@Param("record") MiniGoodsCateRelationships record, @Param("example") MiniGoodsCateRelationshipsExample example);

    int updateByPrimaryKeySelective(MiniGoodsCateRelationships record);

    int updateByPrimaryKey(MiniGoodsCateRelationships record);
}