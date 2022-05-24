package org.study.sample.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.study.sample.mapper.MemberMapper;
import org.study.sample.model.MemberDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper mapper;
	
	//@Test
	public void memberInsertTest() {
		log.info("memberInsertTest() 시작");
		MemberDTO dto = new MemberDTO();
		dto.setM_id("testID");
		dto.setM_pw("testPW");
		dto.setM_address("대구");
		log.info("dto 값 확인: " + dto);
		mapper.memberInsert(dto);
		log.info("memberInsertTest() 끝");
	}
	
	//@Test
	public void memberInsertDummyTest() {
		for(int i= 11;i<100; i++) {
			MemberDTO dto = new MemberDTO();
			dto.setM_id("testID"+i);
			dto.setM_pw("testPW"+i);
			dto.setM_address("대구"+i);
			log.info("dto 값 확인 :"+dto);
			mapper.memberInsert(dto);
		}
	}

	//@Test
	public void memberListTest() {

		List<MemberDTO> list = mapper.memberList();
		for(MemberDTO dto : list) {
			System.out.println(dto);
		}
		
	}
	
	//@Test 
	public void memberDeleteTest() {
		mapper.memberDelete("2");
	}
	//@Test
	public void memberReadTest() {
	  MemberDTO dto=mapper.memberRead("2");
	  log.info(toString());
	}
	
	@Test
	public void memberUpdateTest() {
		MemberDTO dto = new MemberDTO();
		dto.setM_no(10);
		dto.setM_address("테스트주소");
		mapper.memberUpdate(dto);
		 MemberDTO dto1 = mapper.memberRead("10");
		log.info(dto1.toString());
}
	
	
}