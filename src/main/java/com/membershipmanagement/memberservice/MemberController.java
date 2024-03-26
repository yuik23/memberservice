package com.membershipmanagement.memberservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    private MemberMapper memberMapper;

    public MemberController(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        List<Member> members = memberMapper.findAll();
        return members;
    }

    @GetMapping("/names")
    public List<String> getNames(SameGradeRequest request) {
        List<String> names = memberMapper.findByGrade(request.getEndsWith(), request.getGrade());
        return names;
    }
}
