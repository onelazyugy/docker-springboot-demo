package com.vietle.dockerdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerDemoController {
    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        return "Hello Docker";
    }
}
