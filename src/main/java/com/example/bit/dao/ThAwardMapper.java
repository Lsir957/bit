package com.example.bit.dao;

import com.itcast.bean.ThAward;
import com.itcast.bean.ThAwardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ThAwardMapper {
    long countByExample(ThAwardExample example);

    int deleteByExample(ThAwardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThAward record);

    int insertSelective(ThAward record);

    List<ThAward> selectByExample(ThAwardExample example);

    ThAward selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThAward record, @Param("example") ThAwardExample example);

    int updateByExample(@Param("record") ThAward record, @Param("example") ThAwardExample example);

    int updateByPrimaryKeySelective(ThAward record);

    int updateByPrimaryKey(ThAward record);
}