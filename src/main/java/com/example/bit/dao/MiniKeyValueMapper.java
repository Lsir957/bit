package com.example.bit.dao;

import com.itcast.bean.MiniKeyValue;
import com.itcast.bean.MiniKeyValueExample;
import com.itcast.bean.MiniKeyValueKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniKeyValueMapper {
    long countByExample(MiniKeyValueExample example);

    int deleteByExample(MiniKeyValueExample example);

    int deleteByPrimaryKey(MiniKeyValueKey key);

    int insert(MiniKeyValue record);

    int insertSelective(MiniKeyValue record);

    List<MiniKeyValue> selectByExampleWithBLOBs(MiniKeyValueExample example);

    List<MiniKeyValue> selectByExample(MiniKeyValueExample example);

    MiniKeyValue selectByPrimaryKey(MiniKeyValueKey key);

    int updateByExampleSelective(@Param("record") MiniKeyValue record, @Param("example") MiniKeyValueExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniKeyValue record, @Param("example") MiniKeyValueExample example);

    int updateByExample(@Param("record") MiniKeyValue record, @Param("example") MiniKeyValueExample example);

    int updateByPrimaryKeySelective(MiniKeyValue record);

    int updateByPrimaryKeyWithBLOBs(MiniKeyValue record);
}