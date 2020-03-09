package com.example.helloworld.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;
import java.nio.file.Paths;


@SpringBootTest
public class FileUtilsTest {

    @Test
    public void test_getSize() {
        long size = 0;
        try {
             size = FileUtils.getSize(Paths.get("e:/123.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        double w=size;
        if (w==0){
        //assert w:"文件访问错误";
        }

    }




}


