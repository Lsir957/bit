package com.example.bit.dao;

import com.itcast.bean.GeoProductOrder;
import com.itcast.bean.GeoProductOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeoProductOrderMapper {
    long countByExample(GeoProductOrderExample example);

    int deleteByExample(GeoProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GeoProductOrder record);

    int insertSelective(GeoProductOrder record);

    List<GeoProductOrder> selectByExample(GeoProductOrderExample example);

    GeoProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GeoProductOrder record, @Param("example") GeoProductOrderExample example);

    int updateByExample(@Param("record") GeoProductOrder record, @Param("example") GeoProductOrderExample example);

    int updateByPrimaryKeySelective(GeoProductOrder record);

    int updateByPrimaryKey(GeoProductOrder record);
}