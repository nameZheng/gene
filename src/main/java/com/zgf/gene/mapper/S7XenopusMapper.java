package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S7Xenopus;
import com.zgf.gene.pojo.S7XenopusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S7XenopusMapper {
    int countByExample(S7XenopusExample example);

    int deleteByExample(S7XenopusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S7Xenopus record);

    int insertSelective(S7Xenopus record);

    List<S7Xenopus> selectByExample(S7XenopusExample example);

    S7Xenopus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S7Xenopus record, @Param("example") S7XenopusExample example);

    int updateByExample(@Param("record") S7Xenopus record, @Param("example") S7XenopusExample example);

    int updateByPrimaryKeySelective(S7Xenopus record);

    int updateByPrimaryKey(S7Xenopus record);
}