package com.membershipmanagement.memberservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Select("SELECT * FROM members WHERE id = #{id}")
    Optional<Member> findById(int id);

    @Select("SELECT name FROM members WHERE school_name LIKE CONCAT('%',#{suffix}) AND grade=#{number}")
    List<String> findByGrade(String suffix, int number);
}
