package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S3OmimDisease;
import com.zgf.gene.pojo.S3OmimDiseaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S3OmimDiseaseMapper {
    int countByExample(S3OmimDiseaseExample example);

    int deleteByExample(S3OmimDiseaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S3OmimDisease record);

    int insertSelective(S3OmimDisease record);

    List<S3OmimDisease> selectByExample(S3OmimDiseaseExample example);

    List<S3OmimDisease> showAll();
    
    S3OmimDisease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S3OmimDisease record, @Param("example") S3OmimDiseaseExample example);

    int updateByExample(@Param("record") S3OmimDisease record, @Param("example") S3OmimDiseaseExample example);

    int updateByPrimaryKeySelective(S3OmimDisease record);

    int updateByPrimaryKey(S3OmimDisease record);
}