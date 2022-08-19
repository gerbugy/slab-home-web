package com.slab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("")
    public String index() {
        return onepage();
    }

    @RequestMapping("landing-onepage-corporate")
    public String onepage() {
        return "landing-onepage-corporate";
    }

}
