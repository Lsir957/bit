package com.example.bit.dao;

import com.itcast.bean.MiniUserAward;
import com.itcast.bean.MiniUserAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUserAwardMapper {
    long countByExample(MiniUserAwardExample example);

    int deleteByExample(MiniUserAwardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniUserAward record);

    int insertSelective(MiniUserAward record);

    List<MiniUserAward> selectByExample(MiniUserAwardExample example);

    MiniUserAward selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniUserAward record, @Param("example") MiniUserAwardExample example);

    int updateByExample(@Param("record") MiniUserAward record, @Param("example") MiniUserAwardExample example);

    int updateByPrimaryKeySelective(MiniUserAward record);

    int updateByPrimaryKey(MiniUserAward record);
}