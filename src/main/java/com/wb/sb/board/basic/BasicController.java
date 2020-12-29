package com.wb.sb.board.basic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic/**")
public class BasicController {
	
	@GetMapping("basicList")
	public String getList() throws Exception{

		return "board/basicList";
	}
	
	
}
