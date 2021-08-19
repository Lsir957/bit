package com.example.bit.dao;

import com.itcast.bean.MiniUserExtend;
import com.itcast.bean.MiniUserExtendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniUserExtendMapper {
    long countByExample(MiniUserExtendExample example);

    int deleteByExample(MiniUserExtendExample example);

    int insert(MiniUserExtend record);

    int insertSelective(MiniUserExtend record);

    List<MiniUserExtend> selectByExample(MiniUserExtendExample example);

    int updateByExampleSelective(@Param("record") MiniUserExtend record, @Param("example") MiniUserExtendExample example);

    int updateByExample(@Param("record") MiniUserExtend record, @Param("example") MiniUserExtendExample example);
}