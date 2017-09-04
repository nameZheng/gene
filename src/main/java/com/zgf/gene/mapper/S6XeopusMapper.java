package com.zgf.gene.mapper;

import com.zgf.gene.pojo.S6Xeopus;
import com.zgf.gene.pojo.S6XeopusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface S6XeopusMapper {
    int countByExample(S6XeopusExample example);

    int deleteByExample(S6XeopusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(S6Xeopus record);

    int insertSelective(S6Xeopus record);

    List<S6Xeopus> selectByExample(S6XeopusExample example);
    
    List<S6Xeopus> showAll();

    S6Xeopus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S6Xeopus record, @Param("example") S6XeopusExample example);

    int updateByExample(@Param("record") S6Xeopus record, @Param("example") S6XeopusExample example);

    int updateByPrimaryKeySelective(S6Xeopus record);

    int updateByPrimaryKey(S6Xeopus record);
}