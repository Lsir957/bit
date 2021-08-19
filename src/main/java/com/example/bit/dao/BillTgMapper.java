package com.example.bit.dao;

import com.itcast.bean.BillTg;
import com.itcast.bean.BillTgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillTgMapper {
    long countByExample(BillTgExample example);

    int deleteByExample(BillTgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillTg record);

    int insertSelective(BillTg record);

    List<BillTg> selectByExample(BillTgExample example);

    BillTg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillTg record, @Param("example") BillTgExample example);

    int updateByExample(@Param("record") BillTg record, @Param("example") BillTgExample example);

    int updateByPrimaryKeySelective(BillTg record);

    int updateByPrimaryKey(BillTg record);
}