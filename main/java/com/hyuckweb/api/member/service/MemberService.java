package com.hyuckweb.api.member.service;

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
    String memberList();
    String memberInfo();
    String checkList();
    String regSendEmail();
    String SaveMoneyList();
    String checkSavings();
    String save();
    String delete();

}
