package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import demo.controllers.boardRestController;
import demo.domain.BoardPager;
import demo.domain.pageVO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BoardPager.class)
public class BoardBootApplicationTests {

	private Logger logger = LoggerFactory.getLogger(BoardBootApplicationTests.class);
	
	@MockBean
	BoardPager pageVo;
	
	@Test
	public void contextLoads() {
		
		BoardPager pageVo = new BoardPager(1200,10);
		
		logger.info("getPageBegin" + pageVo.getPageBegin());
		
		logger.info("getPageEnd" + pageVo.getPageEnd());
		logger.info("getBlockBegin" + pageVo.getBlockBegin());
		logger.info("getBlockEnd" + pageVo.getBlockEnd());
		logger.info("getCurBlock" + pageVo.getCurBlock());
		logger.info("getCurPage" + pageVo.getCurPage());
		logger.info("getPrevPage" + pageVo.getPrevPage());
		logger.info("getNextPage" + pageVo.getNextPage());
		
		logger.info("getTotPage" + pageVo.getTotPage());
		logger.info("getTotBlock" + pageVo.getTotBlock());
		
	}

}
