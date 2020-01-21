package com.major.simple.mapper;

import com.major.simple.model.RuleDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RuleDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RuleDO record);

    int insertSelective(RuleDO record);

    RuleDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RuleDO record);

    int updateByPrimaryKey(RuleDO record);
}