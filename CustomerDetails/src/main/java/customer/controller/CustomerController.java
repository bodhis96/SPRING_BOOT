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
import customer.service.CustomerService;

@RestController
@RequestMapping("/Customers")
public class CustomerController {
	@Autowired
	private CustomerService CustomerService;

	@GetMapping("/")
	public ModelAndView findAll() {
		List<Customer> CustomersList = CustomerService.findAll();
		ModelAndView modelAndView = new ModelAndView("listCustomers");
		modelAndView.addObject("CustomerSLIST", CustomersList);
		return modelAndView;
	}
	@PostMapping("checkuser")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("home");
		} else {
			modelAndView = new ModelAndView("index");
		}
		return modelAndView;
	}


	@PostMapping("Customers/save")
	public ModelAndView save(@RequestParam Integer id, @RequestParam String name, @RequestParam String location,@RequestParam String domain) 
	{
		Customer customer=new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setLocation(location);
		customer.setDomain(domain);
		
		CustomerService.save(customer);
		List<Customer> CustomersList = CustomerService.findAll();
		ModelAndView modelAndView = new ModelAndView("listcustomers");
		modelAndView.addObject("CustomerSLIST", CustomersList);
		return modelAndView;
	}
	@PostMapping("Customers//update")
	public ModelAndView modify(@RequestParam Integer id) {
		Customer Customer = CustomerService.findById(id);
		ModelAndView modelAndView = new ModelAndView("updatecustomer");
		modelAndView.addObject("Customer", Customer);
		return modelAndView;
	}

	@GetMapping("Customers/delete")
	public ModelAndView delete(@RequestParam Integer id) {

		Customer Customer = CustomerService.findById(id);
		CustomerService.delete(Customer);
		List<Customer> CustomersList = CustomerService.findAll();
		ModelAndView modelAndView = new ModelAndView("listcustomers");
		modelAndView.addObject("CustomerSLIST", CustomersList);
		return modelAndView;
	}
	@PostMapping("Customers/retrieve")
	public ModelAndView retrieve(@RequestParam Integer id) {
		Customer Customer = CustomerService.findById(id);
		ModelAndView modelAndView = new ModelAndView("customerinfo");
		modelAndView.addObject("Customer", Customer);
		return modelAndView;
	}
}
