package com.metafourarnob.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.metafourarnob.model.Customer;
import com.metafourarnob.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	public CustomerServiceImpl(){
		
	}
//	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository){
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	
//	@Autowired
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		System.out.println("We are using setter injection");
//		this.customerRepository = customerRepository;
//	}





	/* (non-Javadoc)
	 * @see com.metafourarnob.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	

}
