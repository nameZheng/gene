package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S7Zebrafish;
import com.zgf.gene.pojo.S7ZebrafishExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S7ZebrafishMapper {
    int countByExample(S7ZebrafishExample example);

    int deleteByExample(S7ZebrafishExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S7Zebrafish record);

    int insertSelective(S7Zebrafish record);

    List<S7Zebrafish> selectByExample(S7ZebrafishExample example);

    S7Zebrafish selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S7Zebrafish record, @Param("example") S7ZebrafishExample example);

    int updateByExample(@Param("record") S7Zebrafish record, @Param("example") S7ZebrafishExample example);

    int updateByPrimaryKeySelective(S7Zebrafish record);

    int updateByPrimaryKey(S7Zebrafish record);
}