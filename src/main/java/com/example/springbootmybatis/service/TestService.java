package com.example.springbootmybatis.service;

import com.example.springbootmybatis.dto.TestDto;
import com.example.springbootmybatis.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestMapper repository;

    public List<TestDto> getDto(){
        return repository.getMember();
    }

}
