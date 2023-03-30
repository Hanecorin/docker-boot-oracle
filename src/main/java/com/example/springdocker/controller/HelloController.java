package com.example.springdocker.controller;

import com.example.springdocker.service.MemberService;
import com.example.springdocker.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class HelloController {
    @Autowired
    MemberService service;
    @GetMapping("/")
    public String hello(){
        return"Hello Docker2222!!!";
    }

    @GetMapping("/members")
    public List<MemberVO> selectListMembers(){
        return service.selectAllMembers();
    }

    @PostMapping("/addMember")
    public String addBody(@RequestBody MemberVO memberVO){
        service.insertMember(memberVO);
        return "OK";
    }
}
