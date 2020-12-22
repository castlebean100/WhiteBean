package com.wb.sb.board.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.wb.sb.board.BoardVO;

@SpringBootTest
class BasicMapperTest {

	@Autowired
	private BasicMapper BasicMapper;
	
	//@Test
	void setInsertTest() throws Exception {
		BasicVO basicVO = new BasicVO();
		basicVO.setTitle("123");
		basicVO.setContents("123");
		 
		int result = BasicMapper.setInsert(basicVO);
	
		assertNotEquals(0, result);
	}
	
	
	//@Test
	void setUpdateTest() throws Exception {
		BasicVO basicVO = new BasicVO();
		basicVO.setTitle("tttteeesssstttt");
		basicVO.setContents("tttteeessssttt");
		basicVO.setNum(9);
		
		int result = BasicMapper.setUpdate(basicVO);
		
		assertNotEquals(0, result);
	}
	
	
	//@Test
	void setDelteTest() throws Exception {
		BasicVO basicVO = new BasicVO();
		basicVO.setNum(11);
		
		int result =  BasicMapper.setDelete(basicVO);
		assertNotEquals(0, result);
		
	}
	
		@Test
		void getOneTest() throws Exception {
		BasicVO basicVO = new BasicVO();
		basicVO.setNum(5);

		BoardVO boardVO = BasicMapper.getOne(basicVO);
		
		assertNotNull(basicVO);
		
	}
		
	
}
