package customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import customer.model.Customer;

@RestController
@RequestMapping("/trainees")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@GetMapping("/")
	public ModelAndView findAll() {
		List<Customer> traineesList = CustomerService.findAll();
		ModelAndView modelAndView = new ModelAndView("listcustomers");
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
		Customer customer=new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setLocation(location);
		customer.setDomain(domain);
		
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
