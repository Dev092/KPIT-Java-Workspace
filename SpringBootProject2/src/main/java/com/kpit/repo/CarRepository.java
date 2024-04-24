package com.kpit.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.pojo.Car;


@Repository
public interface CarRepository extends CrudRepository<Car,Integer> {

}
