package com.example.bit.dao;

import com.itcast.bean.Lun;
import com.itcast.bean.LunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LunMapper {
    long countByExample(LunExample example);

    int deleteByExample(LunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lun record);

    int insertSelective(Lun record);

    List<Lun> selectByExample(LunExample example);

    Lun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lun record, @Param("example") LunExample example);

    int updateByExample(@Param("record") Lun record, @Param("example") LunExample example);

    int updateByPrimaryKeySelective(Lun record);

    int updateByPrimaryKey(Lun record);
}