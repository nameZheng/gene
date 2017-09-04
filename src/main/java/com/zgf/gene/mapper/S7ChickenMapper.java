package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S7Chicken;
import com.zgf.gene.pojo.S7ChickenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S7ChickenMapper {
    int countByExample(S7ChickenExample example);

    int deleteByExample(S7ChickenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S7Chicken record);

    int insertSelective(S7Chicken record);

    List<S7Chicken> selectByExample(S7ChickenExample example);

    S7Chicken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S7Chicken record, @Param("example") S7ChickenExample example);

    int updateByExample(@Param("record") S7Chicken record, @Param("example") S7ChickenExample example);

    int updateByPrimaryKeySelective(S7Chicken record);

    int updateByPrimaryKey(S7Chicken record);
}