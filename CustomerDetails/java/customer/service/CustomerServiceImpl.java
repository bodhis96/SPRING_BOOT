package customer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import customer.dao.CustomerDao;
import customer.model.Customer;

@Service("traineeService")

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<Customer> findAll() {
		List<Customer> traineeslist = customerDao.findAll();
		return traineeslist;
	}

	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Override
	public void delete(Trainee trainee) {
		traineeDao.delete(trainee);
	}

	@Override
	public Trainee findById(Integer id) {
		Trainee trainee=traineeDao.findById(id).get();
		return trainee;		
	}

}
