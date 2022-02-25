package com.hyuckweb.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.hyuckweb.api.member.domain
 * fileName   : CalcDTO
 * author     : HYUCK7
 * date       : 2022-02-25
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-25         HYUCK7         최초 생성
 */
@Data
@Component
public class CalcDTO {
    private int num1;
    private int num2;
    private String opcode;
}
