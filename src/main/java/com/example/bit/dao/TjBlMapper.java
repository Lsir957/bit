package com.example.bit.dao;

import com.itcast.bean.TjBl;
import com.itcast.bean.TjBlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TjBlMapper {
    long countByExample(TjBlExample example);

    int deleteByExample(TjBlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TjBl record);

    int insertSelective(TjBl record);

    List<TjBl> selectByExample(TjBlExample example);

    TjBl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TjBl record, @Param("example") TjBlExample example);

    int updateByExample(@Param("record") TjBl record, @Param("example") TjBlExample example);

    int updateByPrimaryKeySelective(TjBl record);

    int updateByPrimaryKey(TjBl record);
}