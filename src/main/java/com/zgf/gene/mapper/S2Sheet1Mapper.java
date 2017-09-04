package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S2Sheet1;
import com.zgf.gene.pojo.S2Sheet1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S2Sheet1Mapper {
    int countByExample(S2Sheet1Example example);

    int deleteByExample(S2Sheet1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S2Sheet1 record);

    int insertSelective(S2Sheet1 record);

    List<S2Sheet1> selectByExample(S2Sheet1Example example);

    S2Sheet1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S2Sheet1 record, @Param("example") S2Sheet1Example example);

    int updateByExample(@Param("record") S2Sheet1 record, @Param("example") S2Sheet1Example example);

    int updateByPrimaryKeySelective(S2Sheet1 record);

    int updateByPrimaryKey(S2Sheet1 record);
}