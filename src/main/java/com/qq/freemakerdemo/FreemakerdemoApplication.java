package com.qq.freemakerdemo;

import com.qq.freemakerdemo.config.Config;
import com.qq.freemakerdemo.config.FreemakerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
@SpringBootApplication
@EnableConfigurationProperties({Config.class})
public class FreemakerdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemakerdemoApplication.class, args);
    }

    @Resource(name="myConfig")
    private Config config;

    /*@Autowired
    private FreemakerConfig freemakerConfig;*/

    @GetMapping("/index")
    public String index(HttpServletRequest request){

        request.setAttribute("resource",config);
        //request.setAttribute("config",freemakerConfig);

        return "index";
    }
}
