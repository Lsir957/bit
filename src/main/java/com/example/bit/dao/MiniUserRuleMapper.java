package com.example.bit.dao;

import com.itcast.bean.MiniUserRule;
import com.itcast.bean.MiniUserRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUserRuleMapper {
    long countByExample(MiniUserRuleExample example);

    int deleteByExample(MiniUserRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiniUserRule record);

    int insertSelective(MiniUserRule record);

    List<MiniUserRule> selectByExample(MiniUserRuleExample example);

    MiniUserRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiniUserRule record, @Param("example") MiniUserRuleExample example);

    int updateByExample(@Param("record") MiniUserRule record, @Param("example") MiniUserRuleExample example);

    int updateByPrimaryKeySelective(MiniUserRule record);

    int updateByPrimaryKey(MiniUserRule record);
}