package com.test.AwsDeploymentTest.TestRestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/")
    public String  testFunction()

    {
        return "i am working" ;
    }


}
