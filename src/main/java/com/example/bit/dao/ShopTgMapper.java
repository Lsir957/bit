package com.example.bit.dao;

import com.itcast.bean.ShopTg;
import com.itcast.bean.ShopTgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopTgMapper {
    long countByExample(ShopTgExample example);

    int deleteByExample(ShopTgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopTg record);

    int insertSelective(ShopTg record);

    List<ShopTg> selectByExample(ShopTgExample example);

    ShopTg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopTg record, @Param("example") ShopTgExample example);

    int updateByExample(@Param("record") ShopTg record, @Param("example") ShopTgExample example);

    int updateByPrimaryKeySelective(ShopTg record);

    int updateByPrimaryKey(ShopTg record);
}