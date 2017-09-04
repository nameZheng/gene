package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Human2;
import com.zgf.gene.pojo.S6Human2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6Human2Mapper {
    int countByExample(S6Human2Example example);

    int deleteByExample(S6Human2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Human2 record);

    int insertSelective(S6Human2 record);

    List<S6Human2> selectByExample(S6Human2Example example);
    
    List<S6Human2> showAll();

    S6Human2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Human2 record, @Param("example") S6Human2Example example);

    int updateByExample(@Param("record") S6Human2 record, @Param("example") S6Human2Example example);

    int updateByPrimaryKeySelective(S6Human2 record);

    int updateByPrimaryKey(S6Human2 record);
}