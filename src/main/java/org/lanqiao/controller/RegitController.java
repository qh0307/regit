package org.lanqiao.controller;

import java.util.Date;
import java.util.List;

import org.lanqiao.entity.Regit;
import org.lanqiao.service.RegitSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class RegitController {
	@Autowired
	RegitSevice regitSevice;
	@RequestMapping("regit")
	public String regit() {
		return "regit";
	}
	
	
	@RequestMapping("RegitUser")
	public String RegitUser(Regit regit) {
	
		int ret=regitSevice.regit(regit);
		return "regit";
				
	}
	@RequestMapping("check")
	public String check(Model model) {
		
		List<Regit>list=regitSevice.check();
		model.addAttribute("list", list);
		return "allRegit";
		
	}
	@ResponseBody
	@RequestMapping("getRegByName")
	public String getRegByName(String name) {
		Regit ret=regitSevice.getRegByName(name);
		if(ret!=null) {
		return "y";
		}else {
			return "n";
		}
	
	}
	
}
