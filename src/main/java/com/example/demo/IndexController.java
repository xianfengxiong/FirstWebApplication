package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxf
 * @since 2018/7/30
 */
@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "ok";
    }
}
