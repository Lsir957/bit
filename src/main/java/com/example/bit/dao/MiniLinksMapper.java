package com.example.bit.dao;

import com.itcast.bean.MiniLinks;
import com.itcast.bean.MiniLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniLinksMapper {
    long countByExample(MiniLinksExample example);

    int deleteByExample(MiniLinksExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniLinks record);

    int insertSelective(MiniLinks record);

    List<MiniLinks> selectByExample(MiniLinksExample example);

    MiniLinks selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniLinks record, @Param("example") MiniLinksExample example);

    int updateByExample(@Param("record") MiniLinks record, @Param("example") MiniLinksExample example);

    int updateByPrimaryKeySelective(MiniLinks record);

    int updateByPrimaryKey(MiniLinks record);
}