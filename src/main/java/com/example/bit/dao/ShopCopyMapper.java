package com.example.bit.dao;

import com.itcast.bean.ShopCopy;
import com.itcast.bean.ShopCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopCopyMapper {
    long countByExample(ShopCopyExample example);

    int deleteByExample(ShopCopyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopCopy record);

    int insertSelective(ShopCopy record);

    List<ShopCopy> selectByExample(ShopCopyExample example);

    ShopCopy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopCopy record, @Param("example") ShopCopyExample example);

    int updateByExample(@Param("record") ShopCopy record, @Param("example") ShopCopyExample example);

    int updateByPrimaryKeySelective(ShopCopy record);

    int updateByPrimaryKey(ShopCopy record);
}