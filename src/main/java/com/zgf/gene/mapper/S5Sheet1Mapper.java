package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S5Sheet1;
import com.zgf.gene.pojo.S5Sheet1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S5Sheet1Mapper {
    int countByExample(S5Sheet1Example example);

    int deleteByExample(S5Sheet1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S5Sheet1 record);

    int insertSelective(S5Sheet1 record);

    List<S5Sheet1> selectByExample(S5Sheet1Example example);

    List<S5Sheet1> showAll();
    
    S5Sheet1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S5Sheet1 record, @Param("example") S5Sheet1Example example);

    int updateByExample(@Param("record") S5Sheet1 record, @Param("example") S5Sheet1Example example);

    int updateByPrimaryKeySelective(S5Sheet1 record);

    int updateByPrimaryKey(S5Sheet1 record);
}