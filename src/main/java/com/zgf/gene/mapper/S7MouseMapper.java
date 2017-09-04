package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S7Mouse;
import com.zgf.gene.pojo.S7MouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S7MouseMapper {
    int countByExample(S7MouseExample example);

    int deleteByExample(S7MouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S7Mouse record);

    int insertSelective(S7Mouse record);

    List<S7Mouse> selectByExample(S7MouseExample example);

    S7Mouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S7Mouse record, @Param("example") S7MouseExample example);

    int updateByExample(@Param("record") S7Mouse record, @Param("example") S7MouseExample example);

    int updateByPrimaryKeySelective(S7Mouse record);

    int updateByPrimaryKey(S7Mouse record);
}