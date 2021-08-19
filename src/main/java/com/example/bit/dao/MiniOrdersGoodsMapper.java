package com.example.bit.dao;

import com.itcast.bean.MiniOrdersGoods;
import com.itcast.bean.MiniOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniOrdersGoodsMapper {
    long countByExample(MiniOrdersGoodsExample example);

    int deleteByExample(MiniOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniOrdersGoods record);

    int insertSelective(MiniOrdersGoods record);

    List<MiniOrdersGoods> selectByExampleWithBLOBs(MiniOrdersGoodsExample example);

    List<MiniOrdersGoods> selectByExample(MiniOrdersGoodsExample example);

    MiniOrdersGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniOrdersGoods record, @Param("example") MiniOrdersGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniOrdersGoods record, @Param("example") MiniOrdersGoodsExample example);

    int updateByExample(@Param("record") MiniOrdersGoods record, @Param("example") MiniOrdersGoodsExample example);

    int updateByPrimaryKeySelective(MiniOrdersGoods record);

    int updateByPrimaryKeyWithBLOBs(MiniOrdersGoods record);

    int updateByPrimaryKey(MiniOrdersGoods record);
}