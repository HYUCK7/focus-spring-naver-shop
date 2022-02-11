package com.hyuckweb.api.member.domain;

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
public class MemberDTO {
    private final static MemberDTO memberDTO = new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}

    private String memId;
    private String memName;
    private int memNumber;
    private String addr;
    private String phone1;
    private String phone2;
    private int height;
    private String debutDate;

    public String getMemId() {
        return memId;
    }

    public void setMem_id(String memId) {
        this.memId = memId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMem_name(String memName) {
        this.memName = memName;
    }

    public int getMemNumber() {
        return memNumber;
    }

    public void setMem_number(int memNumber) {
        this.memNumber = memNumber;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebut_date(String debutDate) {
        this.debutDate = debutDate;
    }
}
