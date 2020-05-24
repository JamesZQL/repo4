package com.cms.portal.controller.admin;

import com.cms.service.api.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author zhangqianlin
 * @create 2020-05-11 22:57
 */
@Controller
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("test")
    public String test() {
int i =90;
        return "admin/test/index";
    }
}
