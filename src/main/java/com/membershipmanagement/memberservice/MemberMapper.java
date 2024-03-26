package com.membershipmanagement.memberservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Select("SELECT name FROM members WHERE school_name LIKE CONCAT('%',#{suffix}) AND grade=#{number}")
    List<String> findByGrade(String suffix,int number);
}
