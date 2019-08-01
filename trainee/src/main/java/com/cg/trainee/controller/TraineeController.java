package com.cg.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.model.Trainee;
import com.cg.trainee.service.TraineeService;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
	@Autowired
	private TraineeService traineeService;

	@GetMapping("/")
	public ModelAndView findAll() {
		List<Trainee> traineesList = traineeService.findAll();
		ModelAndView modelAndView = new ModelAndView("listtrainees");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}
	@PostMapping("/checkuser")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("home");
		} else {
			modelAndView = new ModelAndView("index");
		}
		return modelAndView;
	}


	@PostMapping("/save")
	public ModelAndView save(@RequestParam Integer id, @RequestParam String name, @RequestParam String location,@RequestParam String domain) 
	{
		Trainee trainee=new Trainee();
		trainee.setId(id);
		trainee.setName(name);
		trainee.setLocation(location);
		trainee.setDomain(domain);
		
		traineeService.save(trainee);
		List<Trainee> traineesList = traineeService.findAll();
		ModelAndView modelAndView = new ModelAndView("listtrainees");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}
	@PostMapping("/update")
	public ModelAndView modify(@RequestParam Integer id) {
		Trainee trainee = traineeService.findById(id);
		ModelAndView modelAndView = new ModelAndView("updatetrainee");
		modelAndView.addObject("TRAINEE", trainee);
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam Integer id) {

		Trainee trainee = traineeService.findById(id);
		traineeService.delete(trainee);
		List<Trainee> traineesList = traineeService.findAll();
		ModelAndView modelAndView = new ModelAndView("listtrainees");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}
	@PostMapping("/retrieve")
	public ModelAndView retrieve(@RequestParam Integer id) {
		Trainee trainee = traineeService.findById(id);
		ModelAndView modelAndView = new ModelAndView("traineeinfo");
		modelAndView.addObject("TRAINEE", trainee);
		return modelAndView;
	}
}
