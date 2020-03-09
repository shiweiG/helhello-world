package com.example.helloworld.service;

import com.example.helloworld.entiy.User;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;


    @Test
    public void test_logging(){
        String str="adc";
     log.debug("您输入的是{}",str);
    }
    @Test
    public void test_user(){
        User user=new User("ysw","beijig");
        log.debug(user.getAddress());
        log.debug(user.toString());
    }
    @Test
    @DisplayName("输入1+1,预期2")
    public void test_add(){
        Assertions.assertEquals(2,userService.add(1,1));
    }
}
