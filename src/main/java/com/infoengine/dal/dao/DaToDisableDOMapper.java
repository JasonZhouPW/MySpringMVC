package com.infoengine.dal.dao;

import com.infoengine.dal.model.DaToDisableDO;
import com.infoengine.dal.model.DaToDisableDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DaToDisableDOMapper {
    int countByExample(DaToDisableDOExample example);

    int deleteByExample(DaToDisableDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DaToDisableDO record);

    int insertSelective(DaToDisableDO record);

    List<DaToDisableDO> selectByExample(DaToDisableDOExample example);

    DaToDisableDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DaToDisableDO record, @Param("example") DaToDisableDOExample example);

    int updateByExample(@Param("record") DaToDisableDO record, @Param("example") DaToDisableDOExample example);

    int updateByPrimaryKeySelective(DaToDisableDO record);

    int updateByPrimaryKey(DaToDisableDO record);
}