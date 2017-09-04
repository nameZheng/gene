package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S1Zebrafish;
import com.zgf.gene.pojo.S1ZebrafishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S1ZebrafishMapper {
    int countByExample(S1ZebrafishExample example);

    int deleteByExample(S1ZebrafishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S1Zebrafish record);

    int insertSelective(S1Zebrafish record);

    List<S1Zebrafish> selectByExample(S1ZebrafishExample example);

    S1Zebrafish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S1Zebrafish record, @Param("example") S1ZebrafishExample example);

    int updateByExample(@Param("record") S1Zebrafish record, @Param("example") S1ZebrafishExample example);

    int updateByPrimaryKeySelective(S1Zebrafish record);

    int updateByPrimaryKey(S1Zebrafish record);
}