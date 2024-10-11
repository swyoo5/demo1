package com.pgm.springdemo.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    //쿼리가 길어지면 resources/mappers/TimeMapper 파일에 설정
    //    @Select("select now()")
    String getTime();

    //    @Select("select count(*) from test_tbl")
    int getCount();
}
