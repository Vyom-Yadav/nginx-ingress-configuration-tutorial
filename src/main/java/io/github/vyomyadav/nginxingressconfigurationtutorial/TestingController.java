package io.github.vyomyadav.nginxingressconfigurationtutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestingController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/link1")
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/link2/link3")
    public String hello2() {
        return "hello2";
    }

    @GetMapping("/link4/link5/link6")
    public String hello3() {
        return "hello3";
    }

}
