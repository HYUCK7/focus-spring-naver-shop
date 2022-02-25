package com.hyuckweb.api.member.service;

import com.hyuckweb.api.member.domain.CalcDTO;
import com.hyuckweb.api.member.domain.MemberDTO;
import com.hyuckweb.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.hyuckweb.api.member.service
 * fileName   : MemberServiceImpl
 * author     : HYUCK7
 * date       : 2022-02-14
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-14         HYUCK7         최초 생성
 */
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int a = calc.getNum1();
        int b = calc.getNum2();
        int res = 0;
        switch (calc.getOpcode()){
            case "+": res = a+b; break;
            case "-": res = a-b; break;
            case "*": res = a*b; break;
            case "/": res = a/b; break;
            case "%": res = a%b; break;
        }
        return String.format("%d %s %d = %d",a,calc.getOpcode(),b,res);
    }

    @Override
    public String member(MemberDTO member) {
        return repository.member(member);
    }

}
