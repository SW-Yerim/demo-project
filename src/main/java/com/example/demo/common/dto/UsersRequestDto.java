package com.example.demo.common.dto;

import lombok.Data;

@Data
public class UsersRequestDto {
    
    private Integer compId;                 // 사용자 회사
    private Integer deptId;                 // 사용자 부서
    private Integer userId;                 // 사용자 아이디

    // 기본값 셋팅
    public UsersRequestDto(Integer userId) {
        this.userId = userId;
    }
    public UsersRequestDto(Integer compId, Integer deptId, Integer userId) {
        this.compId = compId;
        this.deptId = deptId;
        this.userId = userId;
    }

}
