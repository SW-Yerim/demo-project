package com.example.demo.common.dto;

import lombok.Data;

@Data
public class DepartmentResponseDto {

    private Integer compId;          // 부서 소속 회사
    private String compNm;           // 부서 소속 회사 이름
    private Integer deptId;          // 부서 고유 아이디
    private String deptNm;           // 부서 이름
    private Integer deptStatus;      // 부서 상태 ( 0:사용중 / 1:삭제 )
    
}
