package com.example.bit.dao;

import com.itcast.bean.MiniBanner;
import com.itcast.bean.MiniBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniBannerMapper {
    long countByExample(MiniBannerExample example);

    int deleteByExample(MiniBannerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniBanner record);

    int insertSelective(MiniBanner record);

    List<MiniBanner> selectByExample(MiniBannerExample example);

    MiniBanner selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniBanner record, @Param("example") MiniBannerExample example);

    int updateByExample(@Param("record") MiniBanner record, @Param("example") MiniBannerExample example);

    int updateByPrimaryKeySelective(MiniBanner record);

    int updateByPrimaryKey(MiniBanner record);
}