package com.example.bit.dao;


import java.util.List;


import com.example.bit.bean.AdmTheLog;
import com.example.bit.bean.AdmTheLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface AdmTheLogMapper {
    long countByExample(AdmTheLogExample example);

    int deleteByExample(AdmTheLogExample example);


    int deleteByPrimaryKey(Integer id);

    int insert(AdmTheLog record);

    int insertSelective(AdmTheLog record);

    List<AdmTheLog> selectByExample(AdmTheLogExample example);

    AdmTheLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdmTheLog record, @Param("example") AdmTheLogExample example);

    int updateByExample(@Param("record") AdmTheLog record, @Param("example") AdmTheLogExample example);

    int updateByPrimaryKeySelective(AdmTheLog record);

    int updateByPrimaryKey(AdmTheLog record);
}