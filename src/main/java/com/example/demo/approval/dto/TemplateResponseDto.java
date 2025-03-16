package com.example.demo.approval.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TemplateResponseDto extends Template {
    
    private String compNm;                  // 양식 소속 회사 이름
    private String deptNm;                  // 양식 소속 부서 이름

    // 양식 생성자 관련 컬럼
    private Integer createId;               // 양식 생성자 아이디
    private String createNm;                // 양식 생성자 아이디 이름
    private Integer createCompId;           // 양식 생성자 소속 회사
    private String createCompNm;            // 양식 생성자 소속 회사 이름
    private Integer createDeptId;           // 양식 생성자 소속 부서
    private String createDeptNm;            // 양식 생성자 소속 부서 이름
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDt;         // 양식 생성일

    // 양식 수정자 관련 컬럼
    private Integer updateId;               // 양식 수정자 아이디
    private String updateNm;                // 양식 수정자 아이디 이름
    private Integer updateCompId;           // 양식 수정자 소속 회사
    private String updateCompNm;            // 양식 수정자 소속 회사 이름
    private Integer updateDeptId;           // 양식 수정자 소속 부서
    private String updateDeptNm;            // 양식 수정자 소속 부서 이름
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDt;         // 양식 생성일
    
}
