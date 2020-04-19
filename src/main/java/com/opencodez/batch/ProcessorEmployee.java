package com.opencodez.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opencodez.entity.Employee;
import com.opencodez.repository.EmployeeRepository;

@Component
public class ProcessorEmployee implements ItemProcessor<Employee, Employee> {

	@Autowired
	private EmployeeRepository employee;

	@Override
	public Employee process(Employee employee) throws Exception {
//		Optional<Users> userFromDb = userRepo.findById(user.getUserId());
//		if(userFromDb.isPresent()) {
//			user.setAccount(user.getAccount().add(userFromDb.get().getAccount()));
//		}
		return employee;
	}

}
