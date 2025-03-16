package com.example.demo.approval.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.approval.controller.ApprovalController;
import com.example.demo.approval.dto.DocumentRequestDto;
import com.example.demo.approval.dto.DocumentResponseDto;
import com.example.demo.approval.dto.TemplateInsertRequestDto;
import com.example.demo.approval.dto.TemplateRequestDto;
import com.example.demo.approval.dto.TemplateResponseDto;
import com.example.demo.approval.dto.TemplateUpdateRequestDto;
import com.example.demo.approval.mapper.ApprovalMapper;
import com.example.demo.common.dto.UsersResponseDto;

@Service
public class ApprovalService {

    private static final Logger logger = LoggerFactory.getLogger(ApprovalController.class);

    @Autowired
    private ApprovalMapper approvalMapper;

    /* 
     * 양식 리스트 조회
     * 반환타입 : List<TemplateResponseDto>
     * request : 
     * temId, compId, deptId, searchType, searchKeyword, pageSize, pageNum
     */
    public List<TemplateResponseDto> getTemList(TemplateRequestDto request) {

        logger.info("[GET] getTemList service >>>>>>>>>");

        // 출력 리스트 개수 (기본값 : 10)
        if (request.getPageSize() == null) {
            request.setPageSize(10);
        }

        // 출력 리스트 페이지 (기본값 : 0)
        if (request.getPageNum() == null) {
            request.setPageNum(0);
        } else {
            request.setPageNum((request.getPageNum() - 1) * request.getPageSize());
        }

        return approvalMapper.selectTemList(request);

    }

    /* 
     * 양식 등록
     * 반환타입 : int ( 0:실패 / 1:성공 )
     * request : TemplateInsertRequestDto
     * compId, deptId, temNm(필수), temDescription(필수), temContents(필수), temStatus(필수), 
     * createId(필수), createCompId, createDeptId, createDt
     */
    public int postTem(TemplateInsertRequestDto request, UsersResponseDto userInfo) {

        logger.info("[POST] postTem service >>>>>>>>>");

        // 양식 생성자 기본 정보 request에 담기
        request.setCreateId(userInfo.getUserId());
        request.setCompId(userInfo.getCompId());
        request.setDeptId(userInfo.getDeptId());

        return approvalMapper.insertTem(request);

    }

    /* 
     * 양식 수정
     * 반환타입 : int ( 0:실패 / 1:성공 )
     * request :
     * compId(필수), deptId(필수), temId(필수), temNm(필수), temDescription(필수), temContents(필수), temStatus(필수),
     * updateId(필수), updateCompId, updateDeptId
     */
    public int patchTem(TemplateUpdateRequestDto request, UsersResponseDto userInfo) {

        logger.info("[PATCH] patchTem service >>>>>>>>>");

        // 양식 수정자 기본 정보 request에 담기
        request.setUpdateId(userInfo.getUserId());
        request.setUpdateCompId(userInfo.getCompId());
        request.setUpdateDeptId(userInfo.getDeptId());

        return approvalMapper.updateTem(request);

    }

    /* 
     * 양식 삭제
     * 반환타입 : int ( 0:실패 / 1:성공 )
     * request :
     * temId(필수)
     */
    public int deleteTem(int temId) {

        logger.info("[DELETE] deleteTem service >>>>>>>>>");
    
        return approvalMapper.deleteTem(temId);

    }
    


    /* 
     * 문서 리스트 조회
     * request
     * 
     */
    public List<DocumentResponseDto> getDocList(DocumentRequestDto request) {
        return approvalMapper.getDocList(request);
    }
    
}
