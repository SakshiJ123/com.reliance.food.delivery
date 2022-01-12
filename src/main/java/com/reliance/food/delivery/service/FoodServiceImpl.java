package com.reliance.food.delivery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reliance.food.delivery.model.Food;
import com.reliance.food.delivery.repository.foodRepository;
@Service

public class FoodServiceImpl implements FoodService{
	@Autowired
private foodRepository foodrepository;
	@Override
	public List<Food> getFood() {
		// TODO Auto-generated method stub
		List<Food> foods=foodrepository.findAll();
		
		return foods;
	}

}
