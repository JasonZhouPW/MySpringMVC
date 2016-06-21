package com.infoengine.servcie.impl;

import com.infoengine.dal.dao.DaToDisableDao;
import com.infoengine.service.interfaces.TestService;

import javax.annotation.Resource;

/**
 * Created by Zhoupeiwen on 2016/6/21.
 */
public class TestServiceImpl implements TestService {

    @Resource
    private DaToDisableDao daToDisableDao;

    @Override
    public String getInfo(Long Id) {
        return daToDisableDao.selectByPrimaryKey(1l).toString();
    }

    public DaToDisableDao getDaToDisableDao() {
        return daToDisableDao;
    }

    public void setDaToDisableDao(DaToDisableDao daToDisableDao) {
        this.daToDisableDao = daToDisableDao;
    }
}
