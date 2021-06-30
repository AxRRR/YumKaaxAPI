package com.yumkaax.models.services;

import java.util.List;

import com.yumkaax.models.entity.Food;

public interface MethodsServices {

	public List<Food> findAllFoods();
	
	public Food findByIdFood(Long id);
}
