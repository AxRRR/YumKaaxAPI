package com.yumkaax.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yumkaax.models.entity.Food;
import com.yumkaax.models.services.MethodsServices;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/api")
public class ApiRestController {

	@Autowired
	private MethodsServices method;
	
	@GetMapping("/foods")
	public List<Food> ReceiveFoods() {
		return method.findAllFoods();
	}
	
	@GetMapping("/find/food/{id}")
	public Food GetFoodById(@PathVariable Long id) {
		return method.findByIdFood(id);
	}
}
