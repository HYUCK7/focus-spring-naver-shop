package com.hyuckweb.api.member.controller;

import com.hyuckweb.api.member.domain.MemberDTO;
import com.hyuckweb.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.hyuckweb.api.member.controller
 * fileName   : MemberController
 * author     : HYUCK7
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-11         HYUCK7         최초 생성
 */
@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;
    @GetMapping("/member/bmi/{name}/{length}/{weight}")
    public String getBmi(@PathVariable String name,
                         @PathVariable double length,
                         @PathVariable double weight){
        System.out.println("리액트에서 넘어온 이름: " +name);
        System.out.println("리액트에서 넘어온 키: " +length);
        System.out.println("리액트에서 넘어온 몸무게: " +weight);
        return "BMI는 정상";
    }
}
