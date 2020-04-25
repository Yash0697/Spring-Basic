package com.sunsoft.controller;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sunsoft.Entity.User1;
import com.sunsoft.Entity.TraineeSpringJPA;
import com.sunsoft.service.ITraineeService;



@Controller
@RequestMapping("/Trainee")
public class TraineeController {

	private static final Logger LOG = LoggerFactory.getLogger(TraineeController.class);
	
	@Autowired
	private ITraineeService traineeService;
	
	@RequestMapping("/")
	public String showMenu(){
		return "Menu";
	}
	
	@GetMapping("Home")
	public String goHome(){
		return "redirect:/Trainee/";
	}
	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		List<TraineeSpringJPA> theTrainees = traineeService.getTrainees();
		theModel.addAttribute("trainees", theTrainees);
		System.out.println("List of Data : "+theTrainees);
		return "list-Trainee";		
	}
	
	@GetMapping("/showForm")
	 public String showFormForAdd(Model theModel){
		LOG.debug("inside show customer-form handler method");
		TraineeSpringJPA theTrainee = new TraineeSpringJPA();
		theModel.addAttribute("trainee",theTrainee);
		
		return "Trainee-form";	
		
	}
	
	@GetMapping("/showFormForDelete")
	 public String showFormForDelete(){
		LOG.debug("inside show customer-form handler method");
		return "Trainee-delete-form";			
	}
	
	@GetMapping("/showFormForUpdate")
	 public String showFormForUpdate(){
		LOG.debug("inside show customer-form handler method");
		return "Trainee-update-form";			
	}
	
	@GetMapping("/showFormForRetrieve")
	public String showFormForRetrieve(){
		LOG.debug("inside show customer-form handler method");
		return "Trainee-retrieval-form";			
	}
	
	@PostMapping("/saveTrainee")
	public String saveCustomer(@ModelAttribute("Trainee") TraineeSpringJPA theTrainee)
	{
		traineeService.saveTrainee(theTrainee);
		return "redirect:/Trainee/list";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("traineeId") int theId, Model theModel){
		Optional<TraineeSpringJPA> theTrainee = traineeService.getTrainee(theId);
		theModel.addAttribute("trainee", theTrainee);
		return "Trainee-form";
		
	}
	@GetMapping("/delete")
	public String deleteTrainee(@RequestParam("traineeId") int theId){
		traineeService.deleteTrainee(theId);
		return "redirect:/Trainee/list";
	}
	
	@PostMapping("/retrieve")
	public String retreiveTrainee(@RequestParam("traineeId") int theId,  Model theModel){
		Optional<TraineeSpringJPA> theTrainee = traineeService.getTrainee(theId);
		if(theTrainee.isPresent()){
		ModelAndView model = new ModelAndView("TraineeDetails");
		theModel.addAttribute("trainee", theTrainee.get());
		return "TraineeDetails";
		}
		else
			return "notrainee";
	}
		
}
