package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Zebrafish1;
import com.zgf.gene.pojo.S6Zebrafish1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6Zebrafish1Mapper {
    int countByExample(S6Zebrafish1Example example);

    int deleteByExample(S6Zebrafish1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Zebrafish1 record);

    int insertSelective(S6Zebrafish1 record);

    List<S6Zebrafish1> selectByExample(S6Zebrafish1Example example);
    
    List<S6Zebrafish1> showAll();

    S6Zebrafish1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Zebrafish1 record, @Param("example") S6Zebrafish1Example example);

    int updateByExample(@Param("record") S6Zebrafish1 record, @Param("example") S6Zebrafish1Example example);

    int updateByPrimaryKeySelective(S6Zebrafish1 record);

    int updateByPrimaryKey(S6Zebrafish1 record);
}