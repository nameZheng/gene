package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Chicken;
import com.zgf.gene.pojo.S6ChickenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6ChickenMapper {
    int countByExample(S6ChickenExample example);

    int deleteByExample(S6ChickenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Chicken record);

    int insertSelective(S6Chicken record);

    List<S6Chicken> selectByExample(S6ChickenExample example);
    
    List<S6Chicken> showAll();

    S6Chicken selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Chicken record, @Param("example") S6ChickenExample example);

    int updateByExample(@Param("record") S6Chicken record, @Param("example") S6ChickenExample example);

    int updateByPrimaryKeySelective(S6Chicken record);

    int updateByPrimaryKey(S6Chicken record);
}