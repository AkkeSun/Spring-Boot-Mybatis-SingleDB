package com.example.springbootmybatis;

import com.example.springbootmybatis.dto.TestDto;
import com.example.springbootmybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    TestService service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<TestDto> list = service.getDto();
        list.forEach(System.out::println);
    }
}
