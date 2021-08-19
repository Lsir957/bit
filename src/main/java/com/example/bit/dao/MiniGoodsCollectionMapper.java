package com.example.bit.dao;

import com.itcast.bean.MiniGoodsCollection;
import com.itcast.bean.MiniGoodsCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniGoodsCollectionMapper {
    long countByExample(MiniGoodsCollectionExample example);

    int deleteByExample(MiniGoodsCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniGoodsCollection record);

    int insertSelective(MiniGoodsCollection record);

    List<MiniGoodsCollection> selectByExample(MiniGoodsCollectionExample example);

    MiniGoodsCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniGoodsCollection record, @Param("example") MiniGoodsCollectionExample example);

    int updateByExample(@Param("record") MiniGoodsCollection record, @Param("example") MiniGoodsCollectionExample example);

    int updateByPrimaryKeySelective(MiniGoodsCollection record);

    int updateByPrimaryKey(MiniGoodsCollection record);
}