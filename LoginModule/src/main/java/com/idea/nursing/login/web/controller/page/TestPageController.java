package com.idea.nursing.login.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by horo on 2016/11/3.
 */
@Controller
@RequestMapping("page")
public class TestPageController {

    @RequestMapping("serve/classify/classify")
    public String tett(){
        return "serve/classify/classify";
    }
}
