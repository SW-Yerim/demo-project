package com.example.demo.common.dto;

import lombok.Data;

@Data
public class RankResponseDto {

    private Integer rankId;          // 직급 고유 아이디
    private String rankNm;           // 직급 이름
    private Integer rankLevel;       // 직급 레벨 ( 0:사원 / 1:주임 / ... )
    private Integer rankStatus;      // 직급 상태 ( 0:사용중 / 1:삭제 )
    private Integer compId;          // 직급 회사
    private String compNm;           // 직급 회사 이름
    
}
