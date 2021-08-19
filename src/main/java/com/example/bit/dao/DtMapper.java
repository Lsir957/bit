package com.example.bit.dao;

import com.itcast.bean.Dt;
import com.itcast.bean.DtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtMapper {
    long countByExample(DtExample example);

    int deleteByExample(DtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dt record);

    int insertSelective(Dt record);

    List<Dt> selectByExample(DtExample example);

    Dt selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dt record, @Param("example") DtExample example);

    int updateByExample(@Param("record") Dt record, @Param("example") DtExample example);

    int updateByPrimaryKeySelective(Dt record);

    int updateByPrimaryKey(Dt record);
}