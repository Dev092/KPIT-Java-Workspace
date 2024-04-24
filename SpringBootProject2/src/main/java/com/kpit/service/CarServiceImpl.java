package com.kpit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;

public class CarServiceImpl implements CarService {

	@Autowired
	CarRepository carRepo;
	
	@Override
	public void createNewCarService(Car car) {
		// TODO Auto-generated method stub
		
		carRepo.save(car); // tell the repo to save the object
	}

}