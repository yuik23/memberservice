package com.membershipmanagement.memberservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> getAllMembers() {
        List<Member> allMembers = memberService.findAll();
        return allMembers;
    }

    @GetMapping("/members/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findMember(id);
    }


    @GetMapping("/names")
    public List<String> getNames(SameGradeRequest gradeRequest) {
        List<String> names = memberService.findName(gradeRequest.getEndsWith(), gradeRequest.getGrade());
        return names;
    }
}
