package com.example.bit.dao;

import com.itcast.bean.MiniGoods;
import com.itcast.bean.MiniGoodsExample;
import com.itcast.bean.MiniGoodsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniGoodsMapper {
    long countByExample(MiniGoodsExample example);

    int deleteByExample(MiniGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniGoodsWithBLOBs record);

    int insertSelective(MiniGoodsWithBLOBs record);

    List<MiniGoodsWithBLOBs> selectByExampleWithBLOBs(MiniGoodsExample example);

    List<MiniGoods> selectByExample(MiniGoodsExample example);

    MiniGoodsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniGoodsWithBLOBs record, @Param("example") MiniGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniGoodsWithBLOBs record, @Param("example") MiniGoodsExample example);

    int updateByExample(@Param("record") MiniGoods record, @Param("example") MiniGoodsExample example);

    int updateByPrimaryKeySelective(MiniGoodsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MiniGoodsWithBLOBs record);

    int updateByPrimaryKey(MiniGoods record);
}