package com.sunsoft.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunsoft.Entity.TraineeSpringJPA;
import com.sunsoft.Entity.User1;
import com.sunsoft.service.AdminService;
import com.sunsoft.service.ITraineeService;

@Controller
@RequestMapping("/Admin")
public class AdminController {


	@Autowired
	private AdminService adminService;
	
	@GetMapping("/")
	 public String showFormForAdd(Model theModel){
		
		return "login";	
		
	}
	@PostMapping("/loginAdmin")
	public String loginAdmin(@RequestParam("name") String name, @RequestParam("pwd") String pwd,  Model theModel)
	{
		
		Optional<User1> admin = adminService.getAdmin(name);
		if(admin.isPresent()){
		User1 userObj1 = admin.get();
		System.out.println("Data is : "+userObj1);
		if(pwd.equals(userObj1.getPwd())){
			theModel.addAttribute("user1", name);
			return "redirect:/Trainee/";	
		}
		}
		
			return "errorpage";
		
		
	}
	
}
