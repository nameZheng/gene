package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S1Human;
import com.zgf.gene.pojo.S1HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S1HumanMapper {
    int countByExample(S1HumanExample example);

    int deleteByExample(S1HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S1Human record);

    int insertSelective(S1Human record);

    List<S1Human> selectByExample(S1HumanExample example);

    S1Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S1Human record, @Param("example") S1HumanExample example);

    int updateByExample(@Param("record") S1Human record, @Param("example") S1HumanExample example);

    int updateByPrimaryKeySelective(S1Human record);

    int updateByPrimaryKey(S1Human record);
}