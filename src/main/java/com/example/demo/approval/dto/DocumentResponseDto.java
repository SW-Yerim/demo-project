package com.example.demo.approval.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class DocumentResponseDto {

    private Integer docId;                  // 문서 고유 아이디
    private String docTitle;                // 문서 제목
    private String docContents;             // 문서 내용
    private Integer docStatus;              // 문서 결재 상태
    private Integer compId;                 // 문서 소속 회사
    private String compNm;                  // 문서 소속 회사 이름
    private Integer deptId;                 // 문서 소속 부서
    private String deptNm;                  // 문서 소속 부서 이름
    private Integer docSecret;              // 보안문서 여부
    private Integer createId;               // 문서 생성자
    private Integer createNm;               // 문서 생성자 이름
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDt;         // 문서 생성일
    
}
