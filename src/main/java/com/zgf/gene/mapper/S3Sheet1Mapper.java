package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S3Sheet1;
import com.zgf.gene.pojo.S3Sheet1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S3Sheet1Mapper {
    int countByExample(S3Sheet1Example example);

    int deleteByExample(S3Sheet1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(S3Sheet1 record);

    int insertSelective(S3Sheet1 record);

    List<S3Sheet1> selectByExample(S3Sheet1Example example);

    S3Sheet1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S3Sheet1 record, @Param("example") S3Sheet1Example example);

    int updateByExample(@Param("record") S3Sheet1 record, @Param("example") S3Sheet1Example example);

    int updateByPrimaryKeySelective(S3Sheet1 record);

    int updateByPrimaryKey(S3Sheet1 record);
}