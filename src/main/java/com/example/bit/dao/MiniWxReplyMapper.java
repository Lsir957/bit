package com.example.bit.dao;

import com.itcast.bean.MiniWxReply;
import com.itcast.bean.MiniWxReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniWxReplyMapper {
    long countByExample(MiniWxReplyExample example);

    int deleteByExample(MiniWxReplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniWxReply record);

    int insertSelective(MiniWxReply record);

    List<MiniWxReply> selectByExample(MiniWxReplyExample example);

    MiniWxReply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniWxReply record, @Param("example") MiniWxReplyExample example);

    int updateByExample(@Param("record") MiniWxReply record, @Param("example") MiniWxReplyExample example);

    int updateByPrimaryKeySelective(MiniWxReply record);

    int updateByPrimaryKey(MiniWxReply record);
}