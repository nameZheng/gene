package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Zebrafish2;
import com.zgf.gene.pojo.S6Zebrafish2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6Zebrafish2Mapper {
    int countByExample(S6Zebrafish2Example example);

    int deleteByExample(S6Zebrafish2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Zebrafish2 record);

    int insertSelective(S6Zebrafish2 record);

    List<S6Zebrafish2> selectByExample(S6Zebrafish2Example example);
    
    List<S6Zebrafish2> showAll();

    S6Zebrafish2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Zebrafish2 record, @Param("example") S6Zebrafish2Example example);

    int updateByExample(@Param("record") S6Zebrafish2 record, @Param("example") S6Zebrafish2Example example);

    int updateByPrimaryKeySelective(S6Zebrafish2 record);

    int updateByPrimaryKey(S6Zebrafish2 record);
}