package com.hyuckweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.hyuckweb.api.member.domain
 * fileName   : MemberDTO
 * author     : HYUCK7
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-11         HYUCK7         최초 생성
 */
@Data
@Component
public class MemberDTO {

    private String memId;
    private String memName;
    private String addr;
    private String phone;
    private double weight;
    private double length;
    private String regdate;

}
