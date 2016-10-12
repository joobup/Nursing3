package com.idea.nursing.login.web.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by horo on 2016/10/11.
 */
@Controller
@RequestMapping
public class RegisterPageController {

    @RequestMapping(value="/{url}/{url2}")
    public String register(@PathVariable String url ,@PathVariable String url2){

        return url+"/"+url2;
    }
}
