package com.haresh.practice.aws.awselasticbeanstalk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    public String getHello() {
        return "Hello Welcome to the Page";
    }
}