package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.dto.TestDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    public List <TestDto> getMember();

}
