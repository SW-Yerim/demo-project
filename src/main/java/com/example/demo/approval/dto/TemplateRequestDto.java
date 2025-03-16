package com.example.demo.approval.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TemplateRequestDto extends Template {

    private Integer searchType;             // 검색 타입
    private String searchKeyword;           // 검색 단어
    private Integer pageNum;                // 페이지 번호
    private Integer pageSize;               // 페이지 출력 갯수

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDt;         // 양식 생성일

    // 기본값 셋팅
    public TemplateRequestDto(Integer searchType, String searchKeyword, Integer pageNum, Integer pageSize, LocalDateTime createDt) {
        this.searchType = searchType;
        this.searchKeyword = searchKeyword;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.createDt = LocalDateTime.now();
    }
    
}
