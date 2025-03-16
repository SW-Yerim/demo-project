package com.example.demo.approval.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TemplateUpdateRequestDto extends Template {
    
    private Integer updateId;               // 양식 수정자 아이디
    private Integer updateCompId;           // 양식 수정자 소속 회사
    private Integer updateDeptId;           // 양식 수정자 소속 부서

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateDt;         // 양식 수정일

    // 기본값 셋팅
    public TemplateUpdateRequestDto(Integer updateId, Integer updateCompId, Integer updateDeptId, LocalDateTime updateDt) {
        this.updateId = updateId;
        this.updateCompId = updateCompId;
        this.updateDeptId = updateDeptId;
        this.updateDt = LocalDateTime.now();
    }
    
}
