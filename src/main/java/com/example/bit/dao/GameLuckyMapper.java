package com.example.bit.dao;

import com.itcast.bean.GameLucky;
import com.itcast.bean.GameLuckyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameLuckyMapper {
    long countByExample(GameLuckyExample example);

    int deleteByExample(GameLuckyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GameLucky record);

    int insertSelective(GameLucky record);

    List<GameLucky> selectByExample(GameLuckyExample example);

    GameLucky selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GameLucky record, @Param("example") GameLuckyExample example);

    int updateByExample(@Param("record") GameLucky record, @Param("example") GameLuckyExample example);

    int updateByPrimaryKeySelective(GameLucky record);

    int updateByPrimaryKey(GameLucky record);
}