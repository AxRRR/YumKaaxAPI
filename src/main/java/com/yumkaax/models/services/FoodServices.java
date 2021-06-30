package com.yumkaax.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yumkaax.models.dao.IFood;
import com.yumkaax.models.entity.Food;

@Service
public class FoodServices implements MethodsServices {
	
	@Autowired
	private IFood f;

	@Override
	public List<Food> findAllFoods() {
		return (List<Food>) f.findAll();
	}

	@Override
	public Food findByIdFood(Long id) {
		return f.findByIdLike(id);
	}

}
