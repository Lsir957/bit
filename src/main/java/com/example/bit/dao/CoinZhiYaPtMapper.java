package com.example.bit.dao;

import com.itcast.bean.CoinZhiYaPt;
import com.itcast.bean.CoinZhiYaPtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinZhiYaPtMapper {
    long countByExample(CoinZhiYaPtExample example);

    int deleteByExample(CoinZhiYaPtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinZhiYaPt record);

    int insertSelective(CoinZhiYaPt record);

    List<CoinZhiYaPt> selectByExample(CoinZhiYaPtExample example);

    CoinZhiYaPt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinZhiYaPt record, @Param("example") CoinZhiYaPtExample example);

    int updateByExample(@Param("record") CoinZhiYaPt record, @Param("example") CoinZhiYaPtExample example);

    int updateByPrimaryKeySelective(CoinZhiYaPt record);

    int updateByPrimaryKey(CoinZhiYaPt record);
}