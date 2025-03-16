package com.example.demo.approval.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.approval.dto.DocumentRequestDto;
import com.example.demo.approval.dto.DocumentResponseDto;
import com.example.demo.approval.dto.TemplateInsertRequestDto;
import com.example.demo.approval.dto.TemplateRequestDto;
import com.example.demo.approval.dto.TemplateResponseDto;
import com.example.demo.approval.dto.TemplateUpdateRequestDto;

@Mapper
public interface ApprovalMapper {

    // 양식 관련 메서드
    List<TemplateResponseDto> selectTemList(TemplateRequestDto request);
    int insertTem(TemplateInsertRequestDto request);
    int updateTem(TemplateUpdateRequestDto request);
    int deleteTem(int temId);

    // 문서 관련 메서드
    List<DocumentResponseDto> getDocList(DocumentRequestDto request);
    
}
