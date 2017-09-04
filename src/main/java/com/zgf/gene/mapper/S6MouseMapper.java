package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Mouse;
import com.zgf.gene.pojo.S6MouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6MouseMapper {
    int countByExample(S6MouseExample example);

    int deleteByExample(S6MouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Mouse record);

    int insertSelective(S6Mouse record);

    List<S6Mouse> selectByExample(S6MouseExample example);
    
    List<S6Mouse> showAll();

    S6Mouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Mouse record, @Param("example") S6MouseExample example);

    int updateByExample(@Param("record") S6Mouse record, @Param("example") S6MouseExample example);

    int updateByPrimaryKeySelective(S6Mouse record);

    int updateByPrimaryKey(S6Mouse record);
}