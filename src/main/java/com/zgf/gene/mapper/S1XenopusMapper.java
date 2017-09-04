package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S1Xenopus;
import com.zgf.gene.pojo.S1XenopusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S1XenopusMapper {
    int countByExample(S1XenopusExample example);

    int deleteByExample(S1XenopusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S1Xenopus record);

    int insertSelective(S1Xenopus record);

    List<S1Xenopus> selectByExample(S1XenopusExample example);

    S1Xenopus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S1Xenopus record, @Param("example") S1XenopusExample example);

    int updateByExample(@Param("record") S1Xenopus record, @Param("example") S1XenopusExample example);

    int updateByPrimaryKeySelective(S1Xenopus record);

    int updateByPrimaryKey(S1Xenopus record);
}