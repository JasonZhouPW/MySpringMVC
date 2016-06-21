package com.infoengine.servcie.impl;

import com.infoengine.dal.dao.DaToDisableDao;
import com.infoengine.service.interfaces.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Zhoupeiwen on 2016/6/21.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
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
