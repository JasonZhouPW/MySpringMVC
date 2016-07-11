package com.infoengine.servcie.impl;

import com.infoengine.dal.dao.DaToDisableDao;
import com.infoengine.dal.model.DaToDisableDO;
import com.infoengine.service.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Zhoupeiwen on 2016/6/21.
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Autowired
    private DaToDisableDao daToDisableDao;

    @Override
    public String getInfo(Long Id) {
        return daToDisableDao.selectByPrimaryKey(1l).getDaBelongDate();
    }


    @Override
    public int addInfo() {
        DaToDisableDO ddo = new DaToDisableDO();
        ddo.setId(9999l);
        ddo.setCreateTime(new Date());
        ddo.setDaId(9999l);
        ddo.setDaBelongDate("20160624");
        daToDisableDao.insertSelective(ddo);

        ddo.setId(10000l);
        ddo.setDaId(10000l);
        return daToDisableDao.insertSelective(ddo);
    }

    public DaToDisableDao getDaToDisableDao() {
        return daToDisableDao;
    }

    public void setDaToDisableDao(DaToDisableDao daToDisableDao) {
        this.daToDisableDao = daToDisableDao;
    }
}
