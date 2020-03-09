package com.example.helloworld.practice;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
@Slf4j
public class PracticeOneTest {
    @Test
    public void test_get(){
        PracticeOne practiceOne=new PracticeOne();
        practiceOne.get("booo");
    }

}
