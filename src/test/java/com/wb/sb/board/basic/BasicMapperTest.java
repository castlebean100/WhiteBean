package com.wb.sb.board.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BasicMapperTest {

	@Autowired
	private BasicMapper BasicMapper;
	
	@Test
	void setInsertTest() throws Exception {
		BasicVO basicVO = new BasicVO();
		basicVO.setTitle("test title");
		basicVO.setContents("test contents");
		
		int result = BasicMapper.setInsert(basicVO);
	
		assertNotEquals(0, result);
	}

}
