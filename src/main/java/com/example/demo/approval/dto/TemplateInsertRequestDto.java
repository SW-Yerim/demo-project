package com.example.demo.approval.dto;

import lombok.Data;

@Data
public class TemplateInsertRequestDto extends Template {
    
    private Integer createId;               // 양식 생성자 아이디
    private Integer createCompId;           // 양식 생성자 소속 회사
    private Integer createDeptId;           // 양식 생성자 소속 부서

    // 기본값 셋팅
    public TemplateInsertRequestDto(Integer createId, Integer createCompId, Integer createDeptId) {
        this.createId = createId;
        this.createCompId = createCompId;
        this.createDeptId = createDeptId;
    }
    
}
