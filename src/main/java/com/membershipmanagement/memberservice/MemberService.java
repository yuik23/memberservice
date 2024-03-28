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
        return member.get(); // Optional.get()は値が存在しない場合例外を発⽣させる
    }

    public List<String> findName(SameGradeRequest request) {
        List<String> names = this.memberMapper.findByGrade(request.getEndsWith(), request.getGrade());
        return names;
    }
}
