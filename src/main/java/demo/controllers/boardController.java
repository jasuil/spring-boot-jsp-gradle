package demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.repository.boardRepository;

@Controller
public class boardController {

	private Logger logger = LoggerFactory.getLogger(boardRestController.class);
	
    @Autowired
    private boardRepository demoRepository;

    @RequestMapping(value = "/demo", method= RequestMethod.GET)
    public String demo(Model model) {

    	logger.info("demo page");
        model.addAttribute("result", demoRepository.getUserList());
        return "demo";
    }
}