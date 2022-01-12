package com.reliance.food.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reliance.food.delivery.model.Food;

public interface foodRepository extends JpaRepository<Food, Integer>{

}
