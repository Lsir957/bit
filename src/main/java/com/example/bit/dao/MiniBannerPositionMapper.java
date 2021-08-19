package com.example.bit.dao;

import com.itcast.bean.MiniBannerPosition;
import com.itcast.bean.MiniBannerPositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniBannerPositionMapper {
    long countByExample(MiniBannerPositionExample example);

    int deleteByExample(MiniBannerPositionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniBannerPosition record);

    int insertSelective(MiniBannerPosition record);

    List<MiniBannerPosition> selectByExample(MiniBannerPositionExample example);

    MiniBannerPosition selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniBannerPosition record, @Param("example") MiniBannerPositionExample example);

    int updateByExample(@Param("record") MiniBannerPosition record, @Param("example") MiniBannerPositionExample example);

    int updateByPrimaryKeySelective(MiniBannerPosition record);

    int updateByPrimaryKey(MiniBannerPosition record);
}