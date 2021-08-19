package com.example.bit.dao;

import com.itcast.bean.MiniGoodsCate;
import com.itcast.bean.MiniGoodsCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniGoodsCateMapper {
    long countByExample(MiniGoodsCateExample example);

    int deleteByExample(MiniGoodsCateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniGoodsCate record);

    int insertSelective(MiniGoodsCate record);

    List<MiniGoodsCate> selectByExample(MiniGoodsCateExample example);

    MiniGoodsCate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniGoodsCate record, @Param("example") MiniGoodsCateExample example);

    int updateByExample(@Param("record") MiniGoodsCate record, @Param("example") MiniGoodsCateExample example);

    int updateByPrimaryKeySelective(MiniGoodsCate record);

    int updateByPrimaryKey(MiniGoodsCate record);
}