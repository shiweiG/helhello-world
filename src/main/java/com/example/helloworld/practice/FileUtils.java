package com.example.helloworld.practice;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

@NoArgsConstructor
public class FileUtils {
    public static long getSize(Path path) {
        try {
            return Files.size(path);
        } catch (IOException e) {
            throw new RuntimeException("操作错误！无法对指定文件执行操作");
        }
    }


}
