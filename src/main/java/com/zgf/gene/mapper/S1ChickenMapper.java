package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S1Chicken;
import com.zgf.gene.pojo.S1ChickenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S1ChickenMapper {
    int countByExample(S1ChickenExample example);

    int deleteByExample(S1ChickenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S1Chicken record);

    int insertSelective(S1Chicken record);

    List<S1Chicken> selectByExample(S1ChickenExample example);

    S1Chicken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S1Chicken record, @Param("example") S1ChickenExample example);

    int updateByExample(@Param("record") S1Chicken record, @Param("example") S1ChickenExample example);

    int updateByPrimaryKeySelective(S1Chicken record);

    int updateByPrimaryKey(S1Chicken record);
}