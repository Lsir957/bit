package com.example.bit.dao;

import com.itcast.bean.MiniTerms;
import com.itcast.bean.MiniTermsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniTermsMapper {
    long countByExample(MiniTermsExample example);

    int deleteByExample(MiniTermsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MiniTerms record);

    int insertSelective(MiniTerms record);

    List<MiniTerms> selectByExample(MiniTermsExample example);

    MiniTerms selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MiniTerms record, @Param("example") MiniTermsExample example);

    int updateByExample(@Param("record") MiniTerms record, @Param("example") MiniTermsExample example);

    int updateByPrimaryKeySelective(MiniTerms record);

    int updateByPrimaryKey(MiniTerms record);
}