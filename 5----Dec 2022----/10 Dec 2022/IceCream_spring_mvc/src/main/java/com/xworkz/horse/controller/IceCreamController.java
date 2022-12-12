package com.xworkz.horse.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.horse.dto.IceCreamDto;

@Component
@RequestMapping("/send")
public class IceCreamController {

	
	
	public IceCreamController() {
		System.out.println("created IceCreamController default constructor");
	}
	
	@PostMapping
	public String onSend(IceCreamDto dto, HttpServletRequest request)
	{
		System.out.println("executing onSend");
		System.out.println("Fetching Dto data ");
		if(dto.getPrice()>0 && dto.getQuantity()>0) {
		request.setAttribute("message", "Ice cream info saved successfuly");
		System.out.println(dto);
		
		}else {
			request.setAttribute("error", "Ice cream info not saved");
			request.setAttribute("dto", dto);
		}
		
		return "index.jsp";
	}
	
	
}
