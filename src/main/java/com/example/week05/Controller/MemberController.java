package com.example.week05.Controller;


import com.example.week05.Service.MemberService;
import com.example.week05.dto.Request.LoginRequestDto;
import com.example.week05.dto.Request.MemberRequestDto;
import com.example.week05.dto.Response.MemberResponseDto;
import com.example.week05.dto.Response.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    //회원가입
    @PostMapping("api/member/signup")
    public ResponseDto<?> signup(@RequestBody @Valid MemberRequestDto memberRequestDto)  {
        return memberService.registerMember(memberRequestDto);
    }


    //로그인
    @PostMapping("/api/member/login")
    public ResponseDto<?> login(@RequestBody LoginRequestDto loginRequestDto, HttpServletResponse httpServletResponse){ //HttpServletResponse에 클라이언트한테 토큰 주려고 만든 것
        return memberService.login(loginRequestDto, httpServletResponse);

     }
    }


