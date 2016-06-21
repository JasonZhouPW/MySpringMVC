package com.infoengine.service.interfaces;

import org.springframework.stereotype.Service;

/**
 * Created by Zhoupeiwen on 2016/6/21.
 */
@Service("testService")
public interface TestService {
    String getInfo(Long Id);
}
