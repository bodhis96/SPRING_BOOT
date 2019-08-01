package customer.dao;

import customer.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer>{

}



/*
import com.cg.trainee.model.Trainee;

public interface TraineeDao extends JpaRepository<Trainee, Integer> {

}
*/
