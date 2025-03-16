package com.example.demo.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.common.dto.UsersRequestDto;
import com.example.demo.common.dto.UsersResponseDto;
import com.example.demo.common.mapper.UsersMapper;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    /* 
     * 유저 리스트 조회
     * request
     * compId, deptId, userId
     */
    public List<UsersResponseDto> getUsersList(UsersRequestDto request) {

        return usersMapper.selectUsersList(request);

    }


}