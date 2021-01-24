package com.mewo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * web Controller
 */
@Controller
public class LayuiController {

    /**
     * 跳转 index
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("admin/console")
    public String console() {
        return "console";
    }

    @RequestMapping("admin/one")
    public String one() {
        return "one";
    }

    @RequestMapping("admin/two")
    public String two() {
        return "two";
    }
}
