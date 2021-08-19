package com.example.bit.dao;

import com.itcast.bean.MiniBill;
import com.itcast.bean.MiniBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniBillMapper {
    long countByExample(MiniBillExample example);

    int deleteByExample(MiniBillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniBill record);

    int insertSelective(MiniBill record);

    List<MiniBill> selectByExample(MiniBillExample example);

    MiniBill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniBill record, @Param("example") MiniBillExample example);

    int updateByExample(@Param("record") MiniBill record, @Param("example") MiniBillExample example);

    int updateByPrimaryKeySelective(MiniBill record);

    int updateByPrimaryKey(MiniBill record);
}