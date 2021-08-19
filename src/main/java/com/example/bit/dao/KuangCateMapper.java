package com.example.bit.dao;

import com.itcast.bean.KuangCate;
import com.itcast.bean.KuangCateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuangCateMapper {
    long countByExample(KuangCateExample example);

    int deleteByExample(KuangCateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KuangCate record);

    int insertSelective(KuangCate record);

    List<KuangCate> selectByExample(KuangCateExample example);

    KuangCate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KuangCate record, @Param("example") KuangCateExample example);

    int updateByExample(@Param("record") KuangCate record, @Param("example") KuangCateExample example);

    int updateByPrimaryKeySelective(KuangCate record);

    int updateByPrimaryKey(KuangCate record);
}