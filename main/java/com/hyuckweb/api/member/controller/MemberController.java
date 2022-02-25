package com.hyuckweb.api.member.controller;

import com.hyuckweb.api.member.domain.CalcDTO;
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
@RequestMapping("/member")
public class MemberController {
    private final MemberService service;
    @PostMapping("/calc") public String Calc(@RequestBody CalcDTO calc){
        return service.calc(calc);
    }
    @PostMapping("bmi") public String Bmi(@RequestBody MemberDTO member){
        return service.member(member);
    }
}
