package Crud.Demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Crud.Demo1.entity.Lead;

@Controller
public class LeadController {
	//http://localhost:8080/view
	@RequestMapping("/view")
	public String viewStringCreateLeadFrom(){
		return "create_lead.Jsp";
		//return :requstDispatcher
		
	}
	
	@RequestMapping("/saveLead" )
	public String saveLead(Lead lead) {
	
		System.out.println(lead.getFirstName());
		System.out.println(lead.getLastName());
		System.out.println(lead.getEmail());
		System.out.println(lead.getMobile());
		
		
		
		return "create_lead.jsp";
		
	}
}
