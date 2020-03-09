package com.example.helloworld.practice;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter@Setter
@AllArgsConstructor
@Slf4j
public class PracticeOne {

    public void get(String name) {
        int length = 5;
        if (name.length() <= length) {
       log.debug("输出:{},长度小于5",name);
        }
    }
}
