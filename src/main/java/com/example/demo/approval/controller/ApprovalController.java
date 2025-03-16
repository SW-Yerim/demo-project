package com.example.demo.approval.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.approval.dto.DocumentRequestDto;
import com.example.demo.approval.dto.DocumentResponseDto;
import com.example.demo.approval.dto.TemplateInsertRequestDto;
import com.example.demo.approval.dto.TemplateRequestDto;
import com.example.demo.approval.dto.TemplateResponseDto;
import com.example.demo.approval.dto.TemplateUpdateRequestDto;
import com.example.demo.approval.service.ApprovalService;
import com.example.demo.common.dto.UsersRequestDto;
import com.example.demo.common.dto.UsersResponseDto;
import com.example.demo.common.service.UsersService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/approval")
public class ApprovalController {
    
    private static final Logger logger = LoggerFactory.getLogger(ApprovalController.class);

    @Autowired 
    private UsersService usersService;

    @Autowired 
    private ApprovalService approvalService;

    // 양식 리스트 가져오기
    @GetMapping("/tem")
    public List<TemplateResponseDto> getTemList(TemplateRequestDto request) {

        logger.info("[GET] getTemList >>>>>>>>>");

        return approvalService.getTemList(request);

    }

    // 양식 등록
    @PostMapping("/tem")
    public int postTem(@RequestBody TemplateInsertRequestDto request) {

        logger.info("[POST] postTem >>>>>>>>> ");
        
        // 유저 정보 가져오기
        UsersRequestDto user = new UsersRequestDto(request.getCreateId());
        UsersResponseDto userInfo = usersService.getUsersList(user).get(0);
        
        return approvalService.postTem(request, userInfo);

    }

    // 양식 수정
    @PatchMapping("/tem")
    public int patchTem(@RequestBody TemplateUpdateRequestDto request) {

        logger.info("[PATCH] patchTem >>>>>>>>> ");
        
        // 유저 정보 가져오기
        UsersRequestDto user = new UsersRequestDto(request.getUpdateId());
        UsersResponseDto userInfo = usersService.getUsersList(user).get(0);
        
        return approvalService.patchTem(request, userInfo);

    }

    // 양식 삭제
    @DeleteMapping("/tem")
    public int deleteTem(@RequestParam Integer temId) {

        logger.info("[DELETE] deleteTem >>>>>>>>> ");

        return approvalService.deleteTem(temId);

    }
    

    // 문서 리스트 가져오기
    @GetMapping("/doc")
    public List<DocumentResponseDto> getDocList(@RequestParam DocumentRequestDto request) {

        return approvalService.getDocList(request);

    }
    
}
