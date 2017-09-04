package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Human1;
import com.zgf.gene.pojo.S6Human1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6Human1Mapper {
    int countByExample(S6Human1Example example);

    int deleteByExample(S6Human1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Human1 record);

    int insertSelective(S6Human1 record);

    List<S6Human1> selectByExample(S6Human1Example example);
    
    List<S6Human1> showAll();

    S6Human1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Human1 record, @Param("example") S6Human1Example example);

    int updateByExample(@Param("record") S6Human1 record, @Param("example") S6Human1Example example);

    int updateByPrimaryKeySelective(S6Human1 record);

    int updateByPrimaryKey(S6Human1 record);
}