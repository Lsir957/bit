package com.example.bit.dao;

import com.itcast.bean.KuangProductOrder;
import com.itcast.bean.KuangProductOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KuangProductOrderMapper {
    long countByExample(KuangProductOrderExample example);

    int deleteByExample(KuangProductOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KuangProductOrder record);

    int insertSelective(KuangProductOrder record);

    List<KuangProductOrder> selectByExample(KuangProductOrderExample example);

    KuangProductOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KuangProductOrder record, @Param("example") KuangProductOrderExample example);

    int updateByExample(@Param("record") KuangProductOrder record, @Param("example") KuangProductOrderExample example);

    int updateByPrimaryKeySelective(KuangProductOrder record);

    int updateByPrimaryKey(KuangProductOrder record);
}