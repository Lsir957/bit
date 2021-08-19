package com.example.bit.dao;

import com.itcast.bean.GeoProducts;
import com.itcast.bean.GeoProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeoProductsMapper {
    long countByExample(GeoProductsExample example);

    int deleteByExample(GeoProductsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GeoProducts record);

    int insertSelective(GeoProducts record);

    List<GeoProducts> selectByExampleWithBLOBs(GeoProductsExample example);

    List<GeoProducts> selectByExample(GeoProductsExample example);

    GeoProducts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GeoProducts record, @Param("example") GeoProductsExample example);

    int updateByExampleWithBLOBs(@Param("record") GeoProducts record, @Param("example") GeoProductsExample example);

    int updateByExample(@Param("record") GeoProducts record, @Param("example") GeoProductsExample example);

    int updateByPrimaryKeySelective(GeoProducts record);

    int updateByPrimaryKeyWithBLOBs(GeoProducts record);

    int updateByPrimaryKey(GeoProducts record);
}