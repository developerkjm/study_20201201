package kr.co.service;

import kr.co.vo.MemberVO;

public interface MemberService {

	// 회원가입
	public void register(MemberVO vo) throws Exception;
	
	// 로그인
	public MemberVO login(MemberVO vo) throws Exception;
	
	// 회원가입 수정
	public void memberUpdate(MemberVO vo) throws Exception;
	
	// 회원탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
	
	// 회원탈퇴시 비밀번호 체크
	public int passChk(MemberVO vo) throws Exception;
	
	// 아이디 중복체크
	public int idChk(MemberVO vo) throws Exception;
}