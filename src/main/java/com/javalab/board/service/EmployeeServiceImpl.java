package com.javalab.board.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalab.board.repository.UserRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private UserRepository dao;

	

}