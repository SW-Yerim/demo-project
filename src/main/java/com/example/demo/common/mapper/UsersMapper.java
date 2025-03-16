package com.example.demo.common.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.common.dto.UsersRequestDto;
import com.example.demo.common.dto.UsersResponseDto;

@Mapper
public interface UsersMapper {

    List<UsersResponseDto> selectUsersList(UsersRequestDto request);

}
