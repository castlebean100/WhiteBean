package com.wb.sb.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/") // 괄호 안에 요청URI 작성 
	public String hone() {
		
		return "index";
		
	}

}
