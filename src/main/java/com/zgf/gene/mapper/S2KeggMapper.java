package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S2Kegg;
import com.zgf.gene.pojo.S2KeggExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S2KeggMapper {
    int countByExample(S2KeggExample example);

    int deleteByExample(S2KeggExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S2Kegg record);

    int insertSelective(S2Kegg record);

    List<S2Kegg> selectByExample(S2KeggExample example);
    
    List<S2Kegg> showAll();

    S2Kegg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S2Kegg record, @Param("example") S2KeggExample example);

    int updateByExample(@Param("record") S2Kegg record, @Param("example") S2KeggExample example);

    int updateByPrimaryKeySelective(S2Kegg record);

    int updateByPrimaryKey(S2Kegg record);
}