package com.example.bit.dao;

import com.itcast.bean.MiniGoodsComment;
import com.itcast.bean.MiniGoodsCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniGoodsCommentMapper {
    long countByExample(MiniGoodsCommentExample example);

    int deleteByExample(MiniGoodsCommentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniGoodsComment record);

    int insertSelective(MiniGoodsComment record);

    List<MiniGoodsComment> selectByExampleWithBLOBs(MiniGoodsCommentExample example);

    List<MiniGoodsComment> selectByExample(MiniGoodsCommentExample example);

    MiniGoodsComment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniGoodsComment record, @Param("example") MiniGoodsCommentExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniGoodsComment record, @Param("example") MiniGoodsCommentExample example);

    int updateByExample(@Param("record") MiniGoodsComment record, @Param("example") MiniGoodsCommentExample example);

    int updateByPrimaryKeySelective(MiniGoodsComment record);

    int updateByPrimaryKeyWithBLOBs(MiniGoodsComment record);

    int updateByPrimaryKey(MiniGoodsComment record);
}