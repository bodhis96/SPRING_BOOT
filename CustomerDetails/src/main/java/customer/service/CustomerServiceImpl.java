package customer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import customer.dao.CustomerDao;
import customer.model.Customer;

@Service("customerService")

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> findAll() {
		List<Customer> customerlist = customerDao.findAll();
		return customerlist;
	}

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer);
	}

	@Override
	public Customer findById(Integer id) {
		Customer customer=customerDao.findById(id).get();
		return customer;		
	}

}
