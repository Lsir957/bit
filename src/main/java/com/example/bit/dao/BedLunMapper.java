package com.example.bit.dao;

import com.itcast.bean.BedLun;
import com.itcast.bean.BedLunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BedLunMapper {
    long countByExample(BedLunExample example);

    int deleteByExample(BedLunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BedLun record);

    int insertSelective(BedLun record);

    List<BedLun> selectByExample(BedLunExample example);

    BedLun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BedLun record, @Param("example") BedLunExample example);

    int updateByExample(@Param("record") BedLun record, @Param("example") BedLunExample example);

    int updateByPrimaryKeySelective(BedLun record);

    int updateByPrimaryKey(BedLun record);
}