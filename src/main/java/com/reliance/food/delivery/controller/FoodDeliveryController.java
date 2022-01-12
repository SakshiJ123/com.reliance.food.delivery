package com.reliance.food.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reliance.food.delivery.model.Food;
import com.reliance.food.delivery.service.FoodService;
@RestController
@RequestMapping("/food")
public class FoodDeliveryController {

	@Autowired
	private FoodService foodService;
	@GetMapping("/menu")
	public List<Food> getFood() {
		List<Food> foods = foodService.getFood();
		return foods;
	}
	
}
