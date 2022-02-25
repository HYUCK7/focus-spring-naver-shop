package com.hyuckweb.api.member.repository;

import com.hyuckweb.api.member.domain.CalcDTO;
import com.hyuckweb.api.member.domain.MemberDTO;
import com.hyuckweb.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName: com.hyuckweb.api.member.repository
 * fileName   : MemberRepositoryImpl
 * author     : HYUCK7
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-11         HYUCK7         최초 생성
 */

@Repository
public class MemberRepositoryImpl implements MemberRepository{

    @Override
    public String calc(CalcDTO calc) {
        return null;

    }

    @Override
    public String member(MemberDTO member) {
        return null;
    }
}
