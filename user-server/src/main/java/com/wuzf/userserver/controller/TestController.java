package com.wuzf.userserver.controller;


import com.wuzf.userserver.entity.po.Position;
import com.wuzf.userserver.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private IPositionService positionService;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name) {
        Position position = positionService.get("101");
        System.out.println(position.toString());
        return "return:" + name;
    }
}
