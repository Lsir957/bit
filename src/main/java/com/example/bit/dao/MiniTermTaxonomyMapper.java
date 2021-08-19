package com.example.bit.dao;

import com.itcast.bean.MiniTermTaxonomy;
import com.itcast.bean.MiniTermTaxonomyExample;
import com.itcast.bean.MiniTermTaxonomyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiniTermTaxonomyMapper {
    long countByExample(MiniTermTaxonomyExample example);

    int deleteByExample(MiniTermTaxonomyExample example);

    int deleteByPrimaryKey(MiniTermTaxonomyKey key);

    int insert(MiniTermTaxonomy record);

    int insertSelective(MiniTermTaxonomy record);

    List<MiniTermTaxonomy> selectByExampleWithBLOBs(MiniTermTaxonomyExample example);

    List<MiniTermTaxonomy> selectByExample(MiniTermTaxonomyExample example);

    MiniTermTaxonomy selectByPrimaryKey(MiniTermTaxonomyKey key);

    int updateByExampleSelective(@Param("record") MiniTermTaxonomy record, @Param("example") MiniTermTaxonomyExample example);

    int updateByExampleWithBLOBs(@Param("record") MiniTermTaxonomy record, @Param("example") MiniTermTaxonomyExample example);

    int updateByExample(@Param("record") MiniTermTaxonomy record, @Param("example") MiniTermTaxonomyExample example);

    int updateByPrimaryKeySelective(MiniTermTaxonomy record);

    int updateByPrimaryKeyWithBLOBs(MiniTermTaxonomy record);

    int updateByPrimaryKey(MiniTermTaxonomy record);
}