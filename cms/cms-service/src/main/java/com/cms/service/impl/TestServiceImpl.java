package com.cms.service.impl;

import com.cms.dao.mapper.TestMapper;
import com.cms.service.api.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangqianlin
 * @create 2020-05-11 22:02
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    @Override
    public String count()throws Exception {
        return testMapper.count();
    }
}
