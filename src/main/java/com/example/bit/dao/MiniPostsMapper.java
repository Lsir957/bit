package com.example.bit.dao;

import com.itcast.bean.MiniPosts;
import com.itcast.bean.MiniPostsExample;
import com.itcast.bean.MiniPostsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniPostsMapper {
    long countByExample(MiniPostsExample example);

    int deleteByExample(MiniPostsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniPostsWithBLOBs record);

    int insertSelective(MiniPostsWithBLOBs record);

    List<MiniPostsWithBLOBs> selectByExampleWithBLOBs(MiniPostsExample example);

    List<MiniPosts> selectByExample(MiniPostsExample example);

    MiniPostsWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniPostsWithBLOBs record, @Param("example") MiniPostsExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniPostsWithBLOBs record, @Param("example") MiniPostsExample example);

    int updateByExample(@Param("record") MiniPosts record, @Param("example") MiniPostsExample example);

    int updateByPrimaryKeySelective(MiniPostsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MiniPostsWithBLOBs record);

    int updateByPrimaryKey(MiniPosts record);
}