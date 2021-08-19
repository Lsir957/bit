package com.example.bit.dao;

import com.itcast.bean.CoinZhiYa;
import com.itcast.bean.CoinZhiYaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinZhiYaMapper {
    long countByExample(CoinZhiYaExample example);

    int deleteByExample(CoinZhiYaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinZhiYa record);

    int insertSelective(CoinZhiYa record);

    List<CoinZhiYa> selectByExample(CoinZhiYaExample example);

    CoinZhiYa selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinZhiYa record, @Param("example") CoinZhiYaExample example);

    int updateByExample(@Param("record") CoinZhiYa record, @Param("example") CoinZhiYaExample example);

    int updateByPrimaryKeySelective(CoinZhiYa record);

    int updateByPrimaryKey(CoinZhiYa record);
}