package demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.repository.boardRepository;

@RestController
public class boardRestController {

	private Logger logger = LoggerFactory.getLogger(boardRestController.class);
	
    @Autowired
    private boardRepository demoRepository;

    @RequestMapping(value = "/test", method= RequestMethod.GET)
    public String test(){
    	logger.info("test page");
    	return demoRepository.getUserList().toString();
    }
}
