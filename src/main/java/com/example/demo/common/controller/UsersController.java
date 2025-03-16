package com.example.demo.common.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.approval.controller.ApprovalController;
import com.example.demo.common.dto.UsersRequestDto;
import com.example.demo.common.dto.UsersResponseDto;
import com.example.demo.common.service.UsersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UsersController {
    
    private static final Logger logger = LoggerFactory.getLogger(ApprovalController.class);

    @Autowired 
    private UsersService usersService;

    @GetMapping("/users")
    public List<UsersResponseDto> getUsersList(
        @RequestParam(required = false) Integer compId,
        @RequestParam(required = false) Integer deptId,
        @RequestParam(required = false) Integer userId
    ) {

        logger.info("getUsersList 요청 >>>>>>>>>: compId={}, deptId={}, userId={}", compId, deptId, userId);

        UsersRequestDto request = new UsersRequestDto(compId, deptId, userId);

        return usersService.getUsersList(request);
    }

}
