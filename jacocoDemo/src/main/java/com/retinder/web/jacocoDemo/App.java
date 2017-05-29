package com.retinder.web.jacocoDemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class App {

	@RequestMapping("/plusPrice")
	@ResponseBody
	int plusPrice(int price,int num) {
		
		
		if (price < 0 | num < 0) {
			return -1;
		} 
		
		if(num>1000)
		{
			return -1;
		}
		
		return price * num;
		
		
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}
