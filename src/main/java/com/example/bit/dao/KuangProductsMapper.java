package com.example.bit.dao;

import com.itcast.bean.KuangProducts;
import com.itcast.bean.KuangProductsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuangProductsMapper {
    long countByExample(KuangProductsExample example);

    int deleteByExample(KuangProductsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KuangProducts record);

    int insertSelective(KuangProducts record);

    List<KuangProducts> selectByExampleWithBLOBs(KuangProductsExample example);

    List<KuangProducts> selectByExample(KuangProductsExample example);

    KuangProducts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KuangProducts record, @Param("example") KuangProductsExample example);

    int updateByExampleWithBLOBs(@Param("record") KuangProducts record, @Param("example") KuangProductsExample example);

    int updateByExample(@Param("record") KuangProducts record, @Param("example") KuangProductsExample example);

    int updateByPrimaryKeySelective(KuangProducts record);

    int updateByPrimaryKeyWithBLOBs(KuangProducts record);

    int updateByPrimaryKey(KuangProducts record);
}