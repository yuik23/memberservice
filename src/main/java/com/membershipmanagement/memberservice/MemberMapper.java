package com.membershipmanagement.memberservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM members")
    List<Member> findAll();
}
