package com.spec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spec.entites.Employee;
import com.spec.respository.EmployeeRespositiory;

@Service
public class EmployeeService implements EmployeeServiceInterface {

@Autowired
EmployeeRespositiory repositiory;

@Override
public List<Employee> getAllEmployee() {
	
	
	return repositiory.findAll();
}

@Override
public Employee addEmployee(Employee employee) {
	
	return repositiory.save(employee);
}
//@Override
//public Employee addEmployee(int id) {
//	
//	return repositiory.save(null);
//	}

@Override
public Employee getEmplyeeById(int id) {

	return repositiory.findById(id).get();
}
	@override
	public Employee updateEmployee(int id,Employee emp) {
		Employee e=repositiory.findById(id).get();
		e.setEmpName(emp.getEmpName());
		e.setEmpSalary(emp.getEmpSalary());
		e.setEmail(emp.getEmail());
		e.setAge(emp.getAge());
		e.setDepartment(emp.getDepartment());
		e.setDesignation(emp.getDesignation());
		return repositiory.save(e);
	}
		
	public void deleteEmployee(int id) {
		Employee e=repositiory.findById(id).get();
		int id1=e.getEmid();
		repositiory.delete(e);
		System.out.println("Employee deleted"+id1);
		
	}


	}

	

	
	



