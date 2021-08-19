package com.example.bit.dao;

import com.itcast.bean.BuyList;
import com.itcast.bean.BuyListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyListMapper {
    long countByExample(BuyListExample example);

    int deleteByExample(BuyListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BuyList record);

    int insertSelective(BuyList record);

    List<BuyList> selectByExample(BuyListExample example);

    BuyList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BuyList record, @Param("example") BuyListExample example);

    int updateByExample(@Param("record") BuyList record, @Param("example") BuyListExample example);

    int updateByPrimaryKeySelective(BuyList record);

    int updateByPrimaryKey(BuyList record);
}