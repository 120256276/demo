package com.test.crud.dao;

import com.test.crud.bean.ClentInfo;
import com.test.crud.bean.ClentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClentInfoMapper {
    long countByExample(ClentInfoExample example);

    int deleteByExample(ClentInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClentInfo record);

    int insertSelective(ClentInfo record);

    List<ClentInfo> selectByExample(ClentInfoExample example);

    ClentInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClentInfo record, @Param("example") ClentInfoExample example);

    int updateByExample(@Param("record") ClentInfo record, @Param("example") ClentInfoExample example);

    int updateByPrimaryKeySelective(ClentInfo record);

    int updateByPrimaryKey(ClentInfo record);
}