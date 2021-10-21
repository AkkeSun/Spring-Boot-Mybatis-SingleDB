package com.example.springbootmybatis.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("TestDto")
public class TestDto {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "TestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
