package com.wuzf.userserver;

import com.wuzf.userserver.entity.po.Position;
import com.wuzf.userserver.service.IPositionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserServerApplicationTests {

    @Autowired

    @Test
    public void contextLoads() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        IPositionService positionService = context.getBean(IPositionService.class);
        Position position = positionService.get("101");
        System.out.println(position.toString());
    }

}
