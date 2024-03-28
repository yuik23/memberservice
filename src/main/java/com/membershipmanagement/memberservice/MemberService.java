package com.membershipmanagement.memberservice;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    private MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<Member> findAll() {
        List<Member> allMember = this.memberMapper.findAll();
        return allMember;
    }

    public Member findMember(int id) {
        Optional<Member> member = this.memberMapper.findById(id);
        if (member.isPresent()) {
            return member.get();
        } else {
            throw new MemberNotFoundException("member not found");
        }
    }

    public List<String> findName(SameGradeRequest gradeRequest) {
        List<String> names = this.memberMapper.findByGrade(gradeRequest.getEndsWith(), gradeRequest.getGrade());
        return names;
    }
}