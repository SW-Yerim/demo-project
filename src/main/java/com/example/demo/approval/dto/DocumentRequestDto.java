package com.example.demo.approval.dto;

import lombok.Data;

@Data
public class DocumentRequestDto {
    
    private Integer docId;                   // 문서 고유 아이디
    private String docTitle;                 // 문서 제목
    private Integer pageNum;                 // 페이지 번호
    private Integer pageSize;                // 페이지 출력 갯수

    // 기본값 셋팅
    public DocumentRequestDto(Integer docId, String docTitle, Integer pageNum, Integer pageSize) {
        this.docId = docId;
        this.docTitle = docTitle;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

}
