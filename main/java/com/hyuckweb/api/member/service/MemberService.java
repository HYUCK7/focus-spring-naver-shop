package com.hyuckweb.api.member.service;

import com.hyuckweb.api.member.domain.CalcDTO;
import com.hyuckweb.api.member.domain.MemberDTO;

/**
 * packageName: com.hyuckweb.api.member.service
 * fileName   : MemberService
 * author     : HYUCK7
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-11         HYUCK7         최초 생성
 */
public interface MemberService {

    String calc(CalcDTO calc);

    String member(MemberDTO member);
}
