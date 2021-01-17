package bravelionet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka-consume")
public class TestController {
    @GetMapping("/test/{test}")
    public String test(@PathVariable("test") String test){
        System.out.println(" 测试成功 : " + test);
        return "kafka-consume 成功!";
    }
}
