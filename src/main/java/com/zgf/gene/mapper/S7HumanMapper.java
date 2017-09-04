package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S7Human;
import com.zgf.gene.pojo.S7HumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S7HumanMapper {
    int countByExample(S7HumanExample example);

    int deleteByExample(S7HumanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S7Human record);

    int insertSelective(S7Human record);

    List<S7Human> selectByExample(S7HumanExample example);

    S7Human selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S7Human record, @Param("example") S7HumanExample example);

    int updateByExample(@Param("record") S7Human record, @Param("example") S7HumanExample example);

    int updateByPrimaryKeySelective(S7Human record);

    int updateByPrimaryKey(S7Human record);
}