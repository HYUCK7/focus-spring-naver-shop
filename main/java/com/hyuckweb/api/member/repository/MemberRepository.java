package com.hyuckweb.api.member.repository;

import com.hyuckweb.api.member.domain.CalcDTO;
import com.hyuckweb.api.member.domain.MemberDTO;
import com.hyuckweb.api.member.service.MemberService;

/**
 * packageName: com.hyuckweb.api.member.repository
 * fileName   : MemberRepository
 * author     : HYUCK7
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-11         HYUCK7         최초 생성
 */
public interface MemberRepository{

    String calc(CalcDTO calc);

    String member(MemberDTO member);
}
