package com.example.demo.common.dto;

import lombok.Data;

@Data
public class CompanyResponseDto {

    private Integer compId;          // 회사 고유 아이디
    private String compNm;           // 회사 이름
    private Integer compStatus;      // 회사 상태 ( 0:사용중 / 1:삭제 )
    
}
