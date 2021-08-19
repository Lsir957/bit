package com.example.bit.dao;

import com.itcast.bean.MiniCart;
import com.itcast.bean.MiniCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniCartMapper {
    long countByExample(MiniCartExample example);

    int deleteByExample(MiniCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniCart record);

    int insertSelective(MiniCart record);

    List<MiniCart> selectByExample(MiniCartExample example);

    MiniCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniCart record, @Param("example") MiniCartExample example);

    int updateByExample(@Param("record") MiniCart record, @Param("example") MiniCartExample example);

    int updateByPrimaryKeySelective(MiniCart record);

    int updateByPrimaryKey(MiniCart record);
}