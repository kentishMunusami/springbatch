package com.opencodez.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.opencodez.entity.Employee;
import com.opencodez.repository.EmployeeRepository;

@Component
public class WriterEmployee implements ItemWriter<Employee>{
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	@Transactional
	public void write(List<? extends Employee> employees) throws Exception {
		repo.saveAll(employees);
	}
	
}
