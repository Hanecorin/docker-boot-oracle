package com.example.springdocker.mapper;

import com.example.springdocker.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    public List<MemberVO> selectAllMembers();
    public void insertMember(MemberVO vo);
}