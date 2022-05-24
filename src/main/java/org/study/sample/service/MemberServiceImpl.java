package org.study.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.study.sample.mapper.MemberMapper;
import org.study.sample.model.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper mapper;
	
	@Autowired
	private BCryptPasswordEncoder pwEncoder;
	
	@Override
	 public void memberInsert(MemberDTO dto) {
	
		dto.setM_pw(pwEncoder.encode(dto.getM_pw()));
		
		mapper.memberInsert(dto);
	}

	@Override
	public List<MemberDTO> memberList() {
		
		return mapper.memberList();
	}

	@Override
	public void memberDelete(String m_no) {
		mapper.memberDelete(m_no);
		
	}

	@Override
	public MemberDTO memberRead(String m_no) {
		// TODO Auto-generated method stub
		return mapper.memberRead(m_no);
	}

	@Override
	public void memberUpdate(MemberDTO dto) {
		System.out.println(dto+" ~ memberServiceImpl");
		mapper.memberUpdate(dto);
	}

	@Override
	public String login(MemberDTO dto) {
		
		String resultPW = mapper.getRealPassword(dto.getM_id());
		System.out.println("resultPW 값 : "+resultPW);
		boolean loginFilter = pwEncoder.matches(dto.getM_pw(),resultPW);
		if(loginFilter) {
			return "Success";
		}else {
			return "Fail";
		}
	}

}
