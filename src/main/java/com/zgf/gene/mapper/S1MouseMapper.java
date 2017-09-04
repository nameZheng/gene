package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S1Mouse;
import com.zgf.gene.pojo.S1MouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S1MouseMapper {
    int countByExample(S1MouseExample example);

    int deleteByExample(S1MouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S1Mouse record);

    int insertSelective(S1Mouse record);

    List<S1Mouse> selectByExample(S1MouseExample example);

    S1Mouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S1Mouse record, @Param("example") S1MouseExample example);

    int updateByExample(@Param("record") S1Mouse record, @Param("example") S1MouseExample example);

    int updateByPrimaryKeySelective(S1Mouse record);

    int updateByPrimaryKey(S1Mouse record);
}